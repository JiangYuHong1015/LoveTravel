package com.bdqn.pojo;

public class Line {
    private Integer lid;

    private String leaveCity;

    private String arriveCity;

    private String leaveAirport;

    private String arriveAirport;

    private String linetype;

    public Integer getLid() {
        return lid;
    }

    public void setLid(Integer lid) {
        this.lid = lid;
    }

    public String getLeaveCity() {
        return leaveCity;
    }

    public void setLeaveCity(String leaveCity) {
        this.leaveCity = leaveCity == null ? null : leaveCity.trim();
    }

    public String getArriveCity() {
        return arriveCity;
    }

    public void setArriveCity(String arriveCity) {
        this.arriveCity = arriveCity == null ? null : arriveCity.trim();
    }

    public String getLeaveAirport() {
        return leaveAirport;
    }

    public void setLeaveAirport(String leaveAirport) {
        this.leaveAirport = leaveAirport == null ? null : leaveAirport.trim();
    }

    public String getArriveAirport() {
        return arriveAirport;
    }

    public void setArriveAirport(String arriveAirport) {
        this.arriveAirport = arriveAirport == null ? null : arriveAirport.trim();
    }

    public String getLinetype() {
        return linetype;
    }

    public void setLinetype(String linetype) {
        this.linetype = linetype == null ? null : linetype.trim();
    }
}