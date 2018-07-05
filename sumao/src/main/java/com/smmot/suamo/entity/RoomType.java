package com.smmot.suamo.entity;

import java.util.Date;

/**
 * 房型表实体
 */
public class RoomType {

    //房型ID
    private Integer roomTypeId;

    //房型名称
    private String typeName;

    //创建人ID
    private Long createTitle;

    //逻辑删除状态
    private Integer delstatus;

    //创建时间
    private Date createTime;

    //更新时间
    private Date updateTime;

    public RoomType() {
    }

    public RoomType(Integer roomTypeId, String typeName, Long createTitle, Integer delstatus, Date createTime, Date updateTime) {
        this.roomTypeId = roomTypeId;
        this.typeName = typeName;
        this.createTitle = createTitle;
        this.delstatus = delstatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "RoomType{" +
                "roomTypeId=" + roomTypeId +
                ", typeName='" + typeName + '\'' +
                ", createTitle=" + createTitle +
                ", delstatus=" + delstatus +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Integer getRoomTypeId() {
        return roomTypeId;
    }

    public void setRoomTypeId(Integer roomTypeId) {
        this.roomTypeId = roomTypeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
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
