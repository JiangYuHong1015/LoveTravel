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
import com.bdqn.service.airlines.AirlinesService;
import com.bdqn.service.flight.FlightService;

@Controller
public class FlyTicketController extends BaseController {
	
	private Logger logger = Logger.getLogger(FlyTicketController.class);
	
	@Resource
	private FlightService flightService;
	@Resource
	private AirlinesService airlinesService;
	
	@RequestMapping(value="/flyTicket")
	public String flyTicketIndex(){
		
		logger.debug("flyTicketIndex============>");
		
		
		return "flyTicketPage/flyTicket";
		
	}
	
	
	@RequestMapping(value="/flyTicketList",method=RequestMethod.POST)
	public String getFlyTicketList(@RequestParam String arriveCity,@RequestParam String leaveCity,
			@RequestParam(value="airlineName",required=false)String airlineName,
			@RequestParam(value="leaveDate",required=false)String leaveDate,Model model){
		logger.debug("getFlyTicketList============>");
		logger.debug("getFlyTicketList============>"+leaveDate);
		logger.debug("getFlyTicketList============>"+arriveCity);
		logger.debug("getFlyTicketList============>"+leaveCity);
		logger.debug("getFlyTicketList============>"+airlineName);
		
		List<Flight> flightList = null;
		List<Airlines> airlinesList = null;
		try {
			flightList = flightService.getFlyTicketList(arriveCity, leaveCity,airlineName);
			airlinesList = airlinesService.getAllAirlines(); 
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("flightList", flightList);
		model.addAttribute("airlinesList", airlinesList);
		model.addAttribute("leaveCity", leaveCity);
		model.addAttribute("arriveCity", arriveCity);
		model.addAttribute("leaveDate", leaveDate);
		
		// 624   <!-- 开始修改jsp -->
		
		
		return "flyTicketPage/flyTicketList";
		
	}
	

}
