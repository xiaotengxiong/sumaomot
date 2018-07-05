package com.smmot.suamo.entity;

import java.util.Date;
import java.util.List;

/**
 * 酒店表实体
 */
public class Hotel {

    //酒店ID
    private  Integer hotelId;

    //酒店名称
    private String hotelName;

    //酒店简介
    private  String hotelIntro;

    //位置（省）
    private  String provice;

    //位置（市）
    private  String city;

    //位置（区）
    private  String district;

    //位置（具体位置）
    private  String specificLocation;

    //酒店配置
    private String hotelConfigure;

    //客服电话
    private  String servicePhone;

    //创建人ID
    private  Long createTitle;

    //逻辑删除状态
    private  Integer delstatus;

    //创建时间
    private Date createTime;

    //更新时间
    private  Date updateTime;

    //酒店最低价格
    private Double minPrice;

    //酒店图片
    private String hotelPirture;

    public String getHotelConfigure() {
        return hotelConfigure;
    }

    public void setHotelConfigure(String hotelConfigure) {
        this.hotelConfigure = hotelConfigure;
    }


    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getHotelIntro() {
        return hotelIntro;
    }

    public void setHotelIntro(String hotelIntro) {
        this.hotelIntro = hotelIntro;
    }

    public String getProvice() {
        return provice;
    }

    public void setProvice(String provice) {
        this.provice = provice;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getSpecificLocation() {
        return specificLocation;
    }

    public void setSpecificLocation(String specificLocation) {
        this.specificLocation = specificLocation;
    }

    public String getServicePhone() {
        return servicePhone;
    }

    public void setServicePhone(String servicePhone) {
        this.servicePhone = servicePhone;
    }


    public Long getCreateTitle() {
        return createTitle;
    }

    public void setCreateTitle(Long createTitle) {
        this.createTitle = createTitle;
    }

    public Integer getDelstatus() {
        return delstatus;
    }

    public void setDelstatus(Integer delstatus) {
        this.delstatus = delstatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Double getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(Double minPrice) {
        this.minPrice = minPrice;
    }

    public String getHotelPirture() {
        return hotelPirture;
    }

    public void setHotelPirture(String hotelPirture) {
        this.hotelPirture = hotelPirture;
    }

    public Hotel() {
    }

    public Hotel(Integer hotelId, String hotelName, String hotelIntro, String provice, String city, String district, String specificLocation, String hotelConfigure, String servicePhone, Long createTitle, Integer delstatus, Date createTime, Date updateTime, Double minPrice, String hotelPirture) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelIntro = hotelIntro;
        this.provice = provice;
        this.city = city;
        this.district = district;
        this.specificLocation = specificLocation;
        this.hotelConfigure = hotelConfigure;
        this.servicePhone = servicePhone;
        this.createTitle = createTitle;
        this.delstatus = delstatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.minPrice = minPrice;
        this.hotelPirture = hotelPirture;
    }
}
