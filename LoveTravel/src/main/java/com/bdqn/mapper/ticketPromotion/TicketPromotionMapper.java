package com.bdqn.mapper.ticketPromotion;

import com.bdqn.pojo.TicketPromotion;

import java.util.List;


public interface TicketPromotionMapper {
	
	/**
	 * 获取促销信息列表
	 * @return
	 * @throws Exception
	 */
	List<TicketPromotion> getPromotionList()throws Exception;
	
	
	}