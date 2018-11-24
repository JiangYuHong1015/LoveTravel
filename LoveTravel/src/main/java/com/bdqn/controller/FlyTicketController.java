package com.bdqn.controller;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bdqn.pojo.Flight;
import com.bdqn.service.flight.FlightService;

@Controller
public class FlyTicketController extends BaseController {
	
	private Logger logger = Logger.getLogger(FlyTicketController.class);
	
	@Resource
	private FlightService flightService;
	
	@RequestMapping(value="/flyTicket")
	public String flyTicketIndex(){
		
		logger.debug("flyTicketIndex============>");
		
		
		return "flyTicketPage/flyTicket";
		
	}
	
	
	@RequestMapping(value="/flyTicketList")
	public String getFlyTicketList(@RequestParam String arriveCity,@RequestParam String leaveCity,
			@RequestParam(value="airlineName",required=false)String airlineName,
			@RequestParam(value="leaveDate",required=false)String leaveDate,Model model){
		logger.debug("getFlyTicketList============>");
		
		List<Flight> flightList = null;
		try {
			flightList = flightService.getFlyTicketList(arriveCity, leaveCity,airlineName);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		model.addAttribute("flightList", flightList);
		
		// 624   <!-- 开始修改jsp -->
		
		
		return "flyTicketPage/flyTicketList";
		
	}
	

}
