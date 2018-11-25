package com.bdqn.service.orderStatus;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.mapper.orderStatus.OrderStatusMapper;
import com.bdqn.pojo.OrderStatus;

@Service
public class OrderStatusServiceImpl implements OrderStatusService {

	@Resource
	private OrderStatusMapper orderStatusMapper;
	
	@Override
	public List<OrderStatus> getOrderStatusList() {
		
		List<OrderStatus> orderStatusList = null;
		
		try {
			orderStatusList = orderStatusMapper.getOrderStatusList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return orderStatusList;
	}

}
