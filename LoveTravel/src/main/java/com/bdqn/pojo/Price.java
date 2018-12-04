package com.bdqn.pojo;

public class Price {
    private Integer id;

    private String flightId;

    private Integer dateNo;

    private Integer price;

    private double discount;
    //总座位数
    private Integer totalSeats;
    //当前座位数
    private Integer currentSeats;
    
    

    public String getFlightId() {
		return flightId;
	}

	public void setFlightId(String flightId) {
		this.flightId = flightId;
	}

	public Integer getDateNo() {
		return dateNo;
	}

	public void setDateNo(Integer dateNo) {
		this.dateNo = dateNo;
	}

	public Integer getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(Integer totalSeats) {
		this.totalSeats = totalSeats;
	}

	public Integer getCurrentSeats() {
		return currentSeats;
	}

	public void setCurrentSeats(Integer currentSeats) {
		this.currentSeats = currentSeats;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }




    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

  
}