package com.bdqn.pojo;

public class Airlines {
    private Integer aid;

    private String airlinename;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAirlinename() {
        return airlinename;
    }

    public void setAirlinename(String airlinename) {
        this.airlinename = airlinename == null ? null : airlinename.trim();
    }
}