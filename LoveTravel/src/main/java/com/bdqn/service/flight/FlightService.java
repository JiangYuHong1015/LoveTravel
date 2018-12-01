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
	

	
	/**
	 * 更新剩余座位数
	 * @param seatsLeave 当前数量
	 * @param fid 航班号
	 * @return
	 * @throws Exception
	 */
	boolean updateSeatsNum(int seatsLeave,String fid);	
   
	
	
	
}