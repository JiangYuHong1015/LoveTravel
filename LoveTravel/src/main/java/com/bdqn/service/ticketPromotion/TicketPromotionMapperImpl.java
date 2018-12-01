package com.bdqn.service.ticketPromotion;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.bdqn.mapper.ticketPromotion.TicketPromotionMapper;
import com.bdqn.pojo.TicketPromotion;

@Service
public class TicketPromotionMapperImpl implements TicketPromotionService {
	
	@Resource
	private TicketPromotionMapper ticketPromotionMapper;

	@Override
	public List<TicketPromotion> getPromotionList() throws Exception {
		
		List<TicketPromotion> ticketPromotionList= ticketPromotionMapper.getPromotionList();
		
		return ticketPromotionList;
	}

}
