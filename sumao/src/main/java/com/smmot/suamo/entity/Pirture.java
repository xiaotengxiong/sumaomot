package com.smmot.suamo.entity;

import java.util.Date;

/**
 * 图片表实体
 */
public class Pirture {

    //图片ID
    private Integer pirtureId;

    //酒店ID
    private  Integer hotelId;

    //房型ID
    private  Integer roomTypeId;

    //图片路径
    private  String pirturePath;

    //图片优先级
    private Integer prioritys;

    //创建人ID
    private Long createTitle;

    //删除状态
    private Integer delstatus;

    //创建时间
    private Date createTime;

    //更新时间
    private  Date updateTime;

    public Pirture() {
    }

    public Pirture(Integer pirtureId, Integer hotelId, Integer roomTypeId, String pirturePath, Integer prioritys, Long createTitle, Integer delstatus, Date createTime, Date updateTime) {
        this.pirtureId = pirtureId;
        this.hotelId = hotelId;
        this.roomTypeId = roomTypeId;
        this.pirturePath = pirturePath;
        this.prioritys = prioritys;
        this.createTitle = createTitle;
        this.delstatus = delstatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Integer getPrioritys() {
        return prioritys;
    }

    public void setPrioritys(Integer prioritys) {
        this.prioritys = prioritys;
    }

    public Integer getPirtureId() {
        return pirtureId;
    }

    public void setPirtureId(Integer pirtureId) {
        this.pirtureId = pirtureId;
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

    public String getPirturePath() {
        return pirturePath;
    }

    public void setPirturePath(String pirturePath) {
        this.pirturePath = pirturePath;
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
