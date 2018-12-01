package com.bdqn.service.flightOrder;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.mapper.flightOrder.FlightOrderMapper;
import com.bdqn.pojo.FlightOrder;

@Service
public class FlightOrderServiseImpl implements FlightOrderServise {
	@Resource
	private FlightOrderMapper flightOrderMapper;

	@Override
	public boolean insert(FlightOrder flightOrder) {
		boolean flag = false;
		
		try {
			if(flightOrderMapper.insert(flightOrder) > 0){
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return flag;
	}



}
