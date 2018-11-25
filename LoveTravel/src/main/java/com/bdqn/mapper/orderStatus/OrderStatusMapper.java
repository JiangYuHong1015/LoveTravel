package com.bdqn.mapper.orderStatus;

import java.util.List;

import com.bdqn.pojo.OrderStatus;


public interface OrderStatusMapper {
	List<OrderStatus> getOrderStatusList()throws Exception;
    
}