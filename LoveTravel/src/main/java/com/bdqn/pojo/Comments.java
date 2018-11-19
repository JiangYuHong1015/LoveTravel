package com.bdqn.pojo;

import java.util.Date;

import org.jboss.logging.Field;
import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Comments {
    private Integer id;

    private Integer hotelid;

    private String hotelname;

    private Integer cleanscore;

    private Integer locationscore;

    private Integer servicescore;

    private Integer facilitiesscore;

    private String commentinfo;

    private Integer totalscore;

    private Integer createby;

    private Date createdate;

    private Integer modifyby;

    private Date modifydate;

    private String orderno;

    private String commentsimg;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getHotelid() {
        return hotelid;
    }

    public void setHotelid(Integer hotelid) {
        this.hotelid = hotelid;
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname == null ? null : hotelname.trim();
    }

    public Integer getCleanscore() {
        return cleanscore;
    }

    public void setCleanscore(Integer cleanscore) {
        this.cleanscore = cleanscore;
    }

    public Integer getLocationscore() {
        return locationscore;
    }

    public void setLocationscore(Integer locationscore) {
        this.locationscore = locationscore;
    }

    public Integer getServicescore() {
        return servicescore;
    }

    public void setServicescore(Integer servicescore) {
        this.servicescore = servicescore;
    }

    public Integer getFacilitiesscore() {
        return facilitiesscore;
    }

    public void setFacilitiesscore(Integer facilitiesscore) {
        this.facilitiesscore = facilitiesscore;
    }

    public String getCommentinfo() {
        return commentinfo;
    }

    public void setCommentinfo(String commentinfo) {
        this.commentinfo = commentinfo == null ? null : commentinfo.trim();
    }

    public Integer getTotalscore() {
        return totalscore;
    }

    public void setTotalscore(Integer totalscore) {
        this.totalscore = totalscore;
    }

    public Integer getCreateby() {
        return createby;
    }

    public void setCreateby(Integer createby) {
        this.createby = createby;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getModifyby() {
        return modifyby;
    }

    public void setModifyby(Integer modifyby) {
        this.modifyby = modifyby;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getCommentsimg() {
        return commentsimg;
    }

    public void setCommentsimg(String commentsimg) {
        this.commentsimg = commentsimg == null ? null : commentsimg.trim();
    }
}