package com.bdqn.service.airlines;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.mapper.airlines.AirlinesMapper;
import com.bdqn.pojo.Airlines;

@Service
public class AirlinesServiceImpl implements AirlinesService {
	
	@Resource
	private AirlinesMapper airlinesMapper;

	@Override
	public List<Airlines> getAllAirlines() throws Exception {
		
		List<Airlines> airlinesList= airlinesMapper.getAllAirlines();
		return airlinesList;
	}

}
