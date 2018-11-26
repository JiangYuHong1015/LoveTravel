/**
 * 
 */
/**
 * @author Administrator
 *
 */
package com.bdqn.service.flight;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bdqn.pojo.Flight;

public interface FlightService{

	/**
	 * 根据出发地和目的地获取航班信息
	 * @param arriveCity
	 * @param leaveCity
	 * @return
	 * @throws Exception
	 */
	List<Flight> getFlyTicketList(Flight flight) throws Exception;
	
	
}