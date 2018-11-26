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
import com.bdqn.pojo.Line;
import com.bdqn.service.airlines.AirlinesService;
import com.bdqn.service.flight.FlightService;
import com.bdqn.service.line.LineService;

@Controller
public class FlyTicketController extends BaseController {
	
	private Logger logger = Logger.getLogger(FlyTicketController.class);
	
	@Resource
	private FlightService flightService;
	@Resource
	private AirlinesService airlinesService;
	@Resource
	private LineService lineService;
	
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

		
		//航班列表
		List<Flight> flightList = null;
		//航空公司列表
		List<Airlines> airlinesList = null;
		//起飞及落地机场列表
		List<Line> leaveAirportStationList = null;
		List<Line> arriveAirportStationList = null;
		try {
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
		
		// 624   <!-- 开始修改jsp -->
		
		
		return "flyTicketPage/flyTicketList";
		
	}
	

}
