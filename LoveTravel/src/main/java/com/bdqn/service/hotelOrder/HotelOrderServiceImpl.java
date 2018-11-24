package com.bdqn.service.hotelOrder;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.mapper.hotelOrder.HotelOrderMapper;
import com.bdqn.pojo.Hotelorder;

@Service
public class HotelOrderServiceImpl implements HotelOrderService {
	
	@Resource
	private HotelOrderMapper hotelOrderMapper;

	@Override
	public List<Hotelorder> getHotelOrderByUserId(Integer userId,
			String hotelname, String orderstatus, Integer currentPageNo,
			Integer pageSize) throws Exception {
		List<Hotelorder> hotelOrderList = hotelOrderMapper.getHotelOrderByUserId(userId, hotelname, orderstatus, (currentPageNo-1)*pageSize, pageSize);
		return hotelOrderList;
	}

	@Override
	public int getHotelOrderCount(Integer userId, String hotelname,
			String orderstatus) throws Exception {
		
		int count = hotelOrderMapper.getHotelOrderCount(userId, hotelname, orderstatus);
		return count;
	}

	@Override
	public String deleteHotelOrderById(Integer id) throws Exception {
		String temp = null;
		int count  = hotelOrderMapper.deleteHotelOrderById(id);
		if(count == 0){
			temp = "notexist";
		}else if(count > 0){
			temp="true";
		}else{
			temp="false";
		}
		
		return temp;
	}

	@Override
	public Hotelorder getHotelOrderInfoById(Integer id) throws Exception {
		
		Hotelorder hotelorder = hotelOrderMapper.getHotelOrderInfoById(id);
		return hotelorder;
	}

	

}
