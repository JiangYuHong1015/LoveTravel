package com.bdqn.service.ticketPromotion;

import java.util.List;

import com.bdqn.pojo.TicketPromotion;

public interface TicketPromotionService {
	
	/**
	 * 获取促销信息列表
	 * @return
	 * @throws Exception
	 */
	List<TicketPromotion> getPromotionList()throws Exception;

}
