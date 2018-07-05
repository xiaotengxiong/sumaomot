package com.smmot.suamo.entity;

import java.util.Date;

/**
 * 房间表实体
 */
public class Room {

    //房间ID
    private Integer roomId;

    //酒店ID
    private Integer hotelId;

    //房型ID
    private Integer roomTypeId;

    //房间号
    private String roomNumber;

    //在住状态
    private Integer roomStatus;

    //房间所在楼层数
    private Integer floors;

    //房间面积
    private Integer roomArea;

    //房间介绍
    private String roomDescribe;

    //创建人ID
    private Long createTitle;

    //逻辑删除状态
    private Integer delstatus;

    //创建时间
    private Date createTime;

    //更新时间
    private Date updateTime;

    private String hotelName;

    private String typeName;

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Room(Integer roomId, Integer hotelId, Integer roomTypeId, String roomNumber, Integer roomStatus, Integer floors, Integer roomArea, String roomDescribe, Long createTitle, Integer delstatus, Date createTime, Date updateTime, String hotelName, String typeName) {
        this.roomId = roomId;
        this.hotelId = hotelId;
        this.roomTypeId = roomTypeId;
        this.roomNumber = roomNumber;
        this.roomStatus = roomStatus;
        this.floors = floors;
        this.roomArea = roomArea;
        this.roomDescribe = roomDescribe;
        this.createTitle = createTitle;
        this.delstatus = delstatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.hotelName = hotelName;
        this.typeName = typeName;
    }

    public Room(Integer roomId, Integer hotelId, Integer roomTypeId, String roomNumber, Integer roomStatus, Integer floors, Integer roomArea, String roomDescribe, Long createTitle, Integer delstatus, Date createTime, Date updateTime) {
        this.roomId = roomId;
        this.hotelId = hotelId;
        this.roomTypeId = roomTypeId;
        this.roomNumber = roomNumber;
        this.roomStatus = roomStatus;
        this.floors = floors;
        this.roomArea = roomArea;
        this.roomDescribe = roomDescribe;
        this.createTitle = createTitle;
        this.delstatus = delstatus;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public Room() {
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", hotelId=" + hotelId +
                ", roomTypeId=" + roomTypeId +
                ", roomNumber='" + roomNumber + '\'' +
                ", roomStatus=" + roomStatus +
                ", floors=" + floors +
                ", roomArea=" + roomArea +
                ", roomDescribe='" + roomDescribe + '\'' +
                ", createTitle=" + createTitle +
                ", delstatus=" + delstatus +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                '}';
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
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

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(Integer roomStatus) {
        this.roomStatus = roomStatus;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public Integer getRoomArea() {
        return roomArea;
    }

    public void setRoomArea(Integer roomArea) {
        this.roomArea = roomArea;
    }

    public String getRoomDescribe() {
        return roomDescribe;
    }

    public void setRoomDescribe(String roomDescribe) {
        this.roomDescribe = roomDescribe;
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
