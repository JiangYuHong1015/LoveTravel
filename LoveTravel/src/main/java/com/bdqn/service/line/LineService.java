package com.bdqn.service.line;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bdqn.pojo.Line;

public interface LineService {
	

	/**
	 * 获取起飞机场列表
	 * @param leaveCity
	 * @param arriveCity
	 * @return
	 * @throws Exception
	 */
	List<Line> getLeaveAirportList(String leaveCity,String arriveCity )throws Exception;
	/**
	 * 降落机场列表
	 * @param leaveCity
	 * @param arriveCity
	 * @return
	 * @throws Exception
	 */
	List<Line> getArriveAirportList(String leaveCity,String arriveCity )throws Exception;
	

}
