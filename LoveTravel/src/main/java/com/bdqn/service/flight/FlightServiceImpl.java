package com.bdqn.service.flight;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.mapper.flight.FlightMapper;
import com.bdqn.pojo.Flight;

@Service
public class FlightServiceImpl implements FlightService {
	
	@Resource
	private FlightMapper flightMapper;

	@Override
	public List<Flight> getFlyTicketList(String arriveCity, String leaveCity,String airlineName)
			throws Exception {
		
		List<Flight> flightList = flightMapper.getFlyTicketList(arriveCity, leaveCity,airlineName);
		
		return flightList;
		
	}

}
