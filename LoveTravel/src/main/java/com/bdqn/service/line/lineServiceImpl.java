package com.bdqn.service.line;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.mapper.line.LineMapper;
import com.bdqn.pojo.Line;

@Service
public class lineServiceImpl implements LineService {
	
	@Resource
	private LineMapper lineMapper;

	@Override
	public List<Line> getLeaveAirportList(String leaveCity, String arriveCity)
			throws Exception {
		
		List<Line> airportStationList = lineMapper.getLeaveAirportList(leaveCity, arriveCity);
		return airportStationList;
	}

	@Override
	public List<Line> getArriveAirportList(String leaveCity, String arriveCity)
			throws Exception {
		List<Line> airportStationList = lineMapper.getArriveAirportList(leaveCity, arriveCity);
		return airportStationList;
	}

}
