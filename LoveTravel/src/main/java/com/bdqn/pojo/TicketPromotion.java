package com.bdqn.pojo;

public class TicketPromotion {
	
	private int id;
	//机票折扣
	private double ticketDiscount;
	//退改折扣
	private double endorseDiscount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getTicketDiscount() {
		return ticketDiscount;
	}
	public void setTicketDiscount(double ticketDiscount) {
		this.ticketDiscount = ticketDiscount;
	}
	public double getEndorseDiscount() {
		return endorseDiscount;
	}
	public void setEndorseDiscount(double endorseDiscount) {
		this.endorseDiscount = endorseDiscount;
	}

}
