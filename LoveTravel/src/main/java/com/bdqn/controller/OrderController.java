package com.bdqn.controller;


import java.util.HashMap;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.bdqn.pojo.Hotelorder;
import com.bdqn.pojo.OrderStatus;
import com.bdqn.pojo.User;
import com.bdqn.service.orderStatus.OrderStatusService;
import com.bdqn.service.hotelOrder.HotelOrderService;
import com.bdqn.service.user.UserService;
import com.bdqn.tools.Constants;
import com.bdqn.tools.PageSupport;

@Controller
@RequestMapping(value="/user")
public class OrderController extends BaseController {
	private Logger logger = Logger.getLogger(OrderController.class);
	
	@Resource
	private UserService userService;
	@Resource
	private OrderStatusService orderStatusService;
	
	@Resource
	private HotelOrderService hotelOrderService;
	
	//跳转到酒店订单页面
	@RequestMapping(value="/hotelOrderView")
	public String hotelOrderView(HttpSession session,Model model,
			@RequestParam(value="queryName",required=false)String queryName,
			@RequestParam(value="status",required=false)String status,
			@RequestParam(value="pageIndex",required=false)String pageIndex){
		logger.debug("hotelOrderView===========>");
		logger.debug("queryName===========>"+queryName);
		logger.debug("status===========>"+status);
		logger.debug("pageIndex===========>"+pageIndex);
		
		User user = (User)session.getAttribute(Constants.USER_SESSION);
		int userId = user.getId();
		//酒店订单总数量
		int totalCount = 0;
		try {
			totalCount = hotelOrderService.getHotelOrderCount(userId, queryName, status);
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		//页面容量
		int pageSize = 2;
		//当前页
		int currentPageNo = 1;

		if(null != pageIndex){
			currentPageNo = Integer.parseInt(pageIndex);
		}
		
		//设置页面参数
		PageSupport pages = new PageSupport();
		pages.setPageSize(pageSize);
		pages.setTotalCount(totalCount);
		pages.setCurrentPageNo(currentPageNo);
		
		//控制首页和尾页
		int totalPageCount = pages.getTotalPageCount();
		if(currentPageNo < 1){
			currentPageNo = 1;
		}else if(currentPageNo > totalPageCount ){
			currentPageNo = totalPageCount;
		}
		
		
		List<Hotelorder> hotelorderList = null ;
		List<OrderStatus> orderStatusList = null;
		try {
			hotelorderList = hotelOrderService.getHotelOrderByUserId(userId, queryName, status, currentPageNo, pageSize);
			orderStatusList = orderStatusService.getOrderStatusList();
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("hotelorderList", hotelorderList);
		model.addAttribute("pages", pages);
		model.addAttribute("queryName", queryName);
		model.addAttribute("status", status);
		model.addAttribute("orderStatusList", orderStatusList);
		
		
		return "userPage/hotelOrderView";
		
	}
	
	
	@RequestMapping(value="/deleteHorderOrder")
	@ResponseBody
	public String deleteHotelOrder(@RequestParam(value="id")String id){
		logger.debug("deleteHotelOrder===========>");
		
		HashMap<String,String> resultMap = new HashMap<String, String>();
		String resultInfo = null;
		
		//根据id删除订单，拿到返回结果
		try {
			resultInfo = hotelOrderService.deleteHotelOrderById(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//将返回的结果放入集合
		resultMap.put("result", resultInfo);
		return JSONArray.toJSONString(resultMap);
		
	}
	
	@RequestMapping(value="/orderDetialView",method=RequestMethod.GET)
	public String orderDetialView(String id,Model model){
		
		Hotelorder hotelorder = null;
		try {
			hotelorder = hotelOrderService.getHotelOrderInfoById(Integer.parseInt(id));
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("hotelorder", hotelorder);
		return "userPage/hotelOrderInfo";
		
	}

	
	


}
