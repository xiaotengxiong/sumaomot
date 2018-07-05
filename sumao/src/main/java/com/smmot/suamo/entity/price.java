package com.smmot.suamo.entity;

import java.util.Date;

/**
 * 价格表实体
 */
public class Price {

    //价格ID
    private Integer priceId;

    //酒店ID
    private Integer hotelId;

    //房型ID
    private Integer roomTypeId;

    //价格
    private Double roomPrice;

    //开始时间
    private Date beginTime;

    //结束时间
    private Date endTime;

    //创建人ID
    private Long createTitle;

    //逻辑删除状态
    private Integer delstatus;

    //创建时间
    private Date createTime;

    //更新时间
    private Date updateTime;

    private String roomTypeName;

    private  String pirturePath;

    private String photelName;


    public Price() {
    }


    public Price(Integer priceId, Integer hotelId, Integer roomTypeId, Double roomPrice, Date beginTime, Date endTime, Long createTitle, Integer delstatus, Date createTime, Date updateTime, String roomTypeName, String pirturePath, String photelName) {
        this.priceId = priceId;
        this.hotelId = hotelId;
        this.roomTypeId = roomTypeId;
        this.roomPrice = roomPrice;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.createTitle = createTitle;
        this.delstatus = delstatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.roomTypeName = roomTypeName;
        this.pirturePath = pirturePath;
        this.photelName = photelName;
    }

    public String getRoomTypeName() {
        return roomTypeName;
    }

    public void setRoomTypeName(String roomTypeName) {
        this.roomTypeName = roomTypeName;
    }

    public String getPhotelName() {
        return photelName;
    }

    public void setPhotelName(String photelName) {
        this.photelName = photelName;
    }

    public String getPirturePath() {
        return pirturePath;
    }

    public void setPirturePath(String pirturePath) {
        this.pirturePath = pirturePath;
    }

    public Integer getPriceId() {
        return priceId;
    }

    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
    }

    public Integer getHotelId() {
        return hotelId;
    }

    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public Double getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(Double roomPrice) {
        this.roomPrice = roomPrice;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
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
}
