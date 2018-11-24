package com.bdqn.pojo;

public class Flight {
    private String fid;

    private String lid;

    private String leaveTime;

    private String arriveTime;

    private Double totalTime;

    private Integer price;

    private Integer seatsLeave;

    private Integer aid;

    private Integer timeId;
    
    //起飞城市
    private String leaveCity;
    //到达城市
    private String arriveCity;
    //到达机场名
    private String arriveAirport;
    //起飞机场名
    private String leaveAirport;
    //航空公司名
    private String airlineName;
    
    

   

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public String getLeaveCity() {
		return leaveCity;
	}

	public void setLeaveCity(String leaveCity) {
		this.leaveCity = leaveCity;
	}

	public String getArriveCity() {
		return arriveCity;
	}

	public void setArriveCity(String arriveCity) {
		this.arriveCity = arriveCity;
	}

	public String getArriveAirport() {
		return arriveAirport;
	}

	public void setArriveAirport(String arriveAirport) {
		this.arriveAirport = arriveAirport;
	}

	public String getLeaveAirport() {
		return leaveAirport;
	}

	public void setLeaveAirport(String leaveAirport) {
		this.leaveAirport = leaveAirport;
	}

	public String getFid() {
        return fid;
    }

    public void setFid(String fid) {
        this.fid = fid == null ? null : fid.trim();
    }

    public String getLid() {
        return lid;
    }

    public void setLid(String lid) {
        this.lid = lid == null ? null : lid.trim();
    }

    public String getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(String leaveTime) {
        this.leaveTime = leaveTime == null ? null : leaveTime.trim();
    }

    public String getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(String arriveTime) {
        this.arriveTime = arriveTime == null ? null : arriveTime.trim();
    }

    public Double getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Double totalTime) {
        this.totalTime = totalTime;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getSeatsLeave() {
        return seatsLeave;
    }

    public void setSeatsLeave(Integer seatsLeave) {
        this.seatsLeave = seatsLeave;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getTimeId() {
        return timeId;
    }

    public void setTimeId(Integer timeId) {
        this.timeId = timeId;
    }
}