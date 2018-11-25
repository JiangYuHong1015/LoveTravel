package com.bdqn.service.orderStatus;

import java.util.List;

import com.bdqn.pojo.OrderStatus;

public interface OrderStatusService {
	
	/**
	 * 获取订单状态列表
	 * @return
	 */
	List<OrderStatus> getOrderStatusList();

}
