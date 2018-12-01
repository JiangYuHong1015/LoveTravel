package com.bdqn.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bdqn.pojo.Airlines;
import com.bdqn.pojo.Flight;
import com.bdqn.pojo.FlightOrder;
import com.bdqn.pojo.Line;
import com.bdqn.pojo.TicketPromotion;
import com.bdqn.service.airlines.AirlinesService;
import com.bdqn.service.flight.FlightService;
import com.bdqn.service.flightOrder.FlightOrderServise;
import com.bdqn.service.line.LineService;
import com.bdqn.service.ticketPromotion.TicketPromotionService;

@Controller
public class FlyTicketController extends BaseController {
	
	private Logger logger = Logger.getLogger(FlyTicketController.class);
	
	@Resource
	private FlightService flightService;
	@Resource
	private AirlinesService airlinesService;
	@Resource
	private LineService lineService;
	@Resource
	private TicketPromotionService ticketPromotionService;
	@Resource
	private FlightOrderServise flightOrderServise;
	
	@RequestMapping(value="/flyTicket")
	public String flyTicketIndex(){
		
		logger.debug("flyTicketIndex============>");
		
		return "flyTicketPage/flyTicket";
		
	}
	
	
	@RequestMapping(value="/flyTicketList",method=RequestMethod.POST)
	public String getFlyTicketList(Flight flight,
			@RequestParam(value="leaveDate",required=false)String leaveDate,Model model){
		logger.debug("getFlyTicketList============>");
		logger.debug("getFlyTicketList============>leaveDate=="+leaveDate);

		System.err.println(leaveDate);
		String dateNo = leaveDate.substring(8,10);
		flight.setDateNo(dateNo);
		
		//航班列表
		List<Flight> flightList = null;
		//航空公司列表
		List<Airlines> airlinesList = null;
		//起飞及落地机场列表
		List<Line> leaveAirportStationList = null;
		List<Line> arriveAirportStationList = null;

		//改动开始
		
		List<TicketPromotion> ticketPromotionList = null;
		
		
		try {
			ticketPromotionList = ticketPromotionService.getPromotionList();
			flightList = flightService.getFlyTicketList(flight);
			airlinesList = airlinesService.getAllAirlines(); 
			leaveAirportStationList = lineService.getLeaveAirportList(flight.getLeaveCity(), flight.getArriveCity());
			arriveAirportStationList = lineService.getArriveAirportList(flight.getLeaveCity(), flight.getArriveCity());
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("flightList", flightList);
		model.addAttribute("airlinesList", airlinesList);
		model.addAttribute("leaveCity", flight.getLeaveCity());
		model.addAttribute("arriveCity", flight.getArriveCity());
		model.addAttribute("leaveDate", leaveDate);
		model.addAttribute("timeLable", flight.getTimeLable());
		model.addAttribute("airlineName", flight.getAirlineName());
		model.addAttribute("leaveAirportStationList", leaveAirportStationList);
		model.addAttribute("arriveAirportStationList", arriveAirportStationList);
		
		//改动
		model.addAttribute("ticketPromotionList", ticketPromotionList);
		
		/*HashMap<List, List> mapList = new HashMap<List, List>();
		mapList.put(flightList , ticketPromotionList);
		
		model.addAttribute("mapList", mapList);*/
		
		return "flyTicketPage/flyTicketList";
		
	}
	
	@RequestMapping(value="user/makeFlyOrder")
	public String makeOrder(Flight flight,Model model,String price){
		model.addAttribute("flight", flight);
		model.addAttribute("price", price);
		
		return "flyTicketPage/orderTicket";
	}
	
	
	@RequestMapping(value="user/payForTicket")
	public String payForTicket(FlightOrder flightOrder,Model model,String seatsLeave){
		model.addAttribute("flightOrder", flightOrder);
		model.addAttribute("seatsLeave", seatsLeave);
		return "flyTicketPage/payForTicket";
		
	}
	
	@RequestMapping(value="user/success")
	public String success(FlightOrder flightOrder,Model model,String seatsLeave){
		
		int seatsNum = Integer.parseInt(seatsLeave);
		
		//需要加入订单信息
		boolean flag = flightOrderServise.insert(flightOrder);
		//添加订单成功时，才修改剩余座位数	
		if(flag){
			
			boolean flag2 = flightService.updateSeatsNum(seatsNum, flightOrder.getFid());
			
			if(flag2){
				model.addAttribute("flightOrder", flightOrder);
				return "flyTicketPage/orderSuccess";
			}
		}
		
		return "flyTicketPage/payForTicket";
		
	}
	

}
