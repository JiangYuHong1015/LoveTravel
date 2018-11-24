package com.bdqn.service.hotelOrder;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bdqn.pojo.Hotelorder;

public interface HotelOrderService {
	/**
	 * 根据userId查询订单信息
	 * @param userId
	 * @param hotelname
	 * @param orderstatus
	 * @param currentPageNo
	 * @param pageSize
	 * @return 订单list
	 * @throws Exception
	 */
	List<Hotelorder> getHotelOrderByUserId(Integer userId,String hotelname,String orderstatus,Integer currentPageNo,Integer pageSize)throws Exception;
										   
	
	/**
	 * 根据userId获取订单总数量
	 * @param userId
	 * @param hotelname
	 * @param orderstatus
	 * @return 订单总数量
	 * @throws Exception
	 */
	int getHotelOrderCount(Integer userId,String hotelname,String orderstatus)throws Exception;	
	
	/**
	 * 根据id删除订单
	 * @param id
	 * @return true删除成功 false 删除失败 notexist订单不存在
	 * @throws Exception
	 */
	String deleteHotelOrderById(Integer id)throws Exception;
	
	/**
	 * 根据id查看订单详情
	 * @param id
	 * @return
	 * @throws Exception
	 */
	Hotelorder getHotelOrderInfoById(Integer id)throws Exception;

}
