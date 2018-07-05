package com.smmot.suamo.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * 订单表实体
 */
public class Order {

    //订单ID
    private  Long orderId;

    //用户ID
    private Long userId;

    //价格ID
    private  Integer priceId;

    //预留姓名
    private String reservedName;

    //预留电话
    private Long reservedTelephone;

    //酒店名称
    private String hotelName;

    //房型名称
    private String roomTypeName;

    //预定成功后的房间号
    private String roomName;

    //订单数量
    private Integer orderNumber;

    //订单总价
    private Double orderTotalPrice;

    //预定时间（起）
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private  Date beginBookTime;

    //预定时间（止）
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private  Date endBookTime;

    //备注
    private  String remark;

    //订单状态
    private  Integer orderStatus;

    //订单生成时间
    private Date createTime;

    //逻辑删除状态
    private  Integer delstatus;


    public Order() {
    }

    public Order(Long orderId, Long userId, Integer priceId, String reservedName, Long reservedTelephone, String hotelName, String roomTypeName, String roomName, Integer orderNumber, Double orderTotalPrice, Date beginBookTime, Date endBookTime, String remark, Integer orderStatus, Date createTime, Integer delstatus) {
        this.orderId = orderId;
        this.userId = userId;
        this.priceId = priceId;
        this.reservedName = reservedName;
        this.reservedTelephone = reservedTelephone;
        this.hotelName = hotelName;
        this.roomTypeName = roomTypeName;
        this.roomName = roomName;
        this.orderNumber = orderNumber;
        this.orderTotalPrice = orderTotalPrice;
        this.beginBookTime = beginBookTime;
        this.endBookTime = endBookTime;
        this.remark = remark;
        this.orderStatus = orderStatus;
        this.createTime = createTime;
        this.delstatus = delstatus;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getPriceId() {
        return priceId;
    }

    public void setPriceId(Integer priceId) {
        this.priceId = priceId;
    }

    public String getReservedName() {
        return reservedName;
    }

    public void setReservedName(String reservedName) {
        this.reservedName = reservedName;
    }

    public Long getReservedTelephone() {
        return reservedTelephone;
    }

    public void setReservedTelephone(Long reservedTelephone) {
        this.reservedTelephone = reservedTelephone;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getRoomTypeName() {
        return roomTypeName;
    }

    public void setRoomTypeName(String roomTypeName) {
        this.roomTypeName = roomTypeName;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Double getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(Double orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }


    public Date getBeginBookTime() {
        return beginBookTime;
    }


    public void setBeginBookTime(Date beginBookTime) {
        this.beginBookTime = beginBookTime;
    }

    public Date getEndBookTime() {
        return endBookTime;
    }

    public void setEndBookTime(Date endBookTime) {
        this.endBookTime = endBookTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getDelstatus() {
        return delstatus;
    }

    public void setDelstatus(Integer delstatus) {
        this.delstatus = delstatus;
    }
}
