package com.smmot.suamo.entity;

import javax.validation.constraints.Min;
import java.util.Date;


public class User {

    //用户id
    private  Long userId;

    //用户名
    private  String userName;

    //密码
    private  String password;

    //用户类型
    private  String userType;

    //用户名称
    private  String userCompellation;

    //电话号码
    private Long phone;

    //unionId
    private  String unionId;

    //微信信息
    private  String userInfo;

    //最后一次登录时间
    private  Date lastTime;

    //逻辑删除状态
    private  Integer delstatus;

    //创建时间
    private  Date createTime;

    public User() {
    }

    public User(Long userId, String userName, String password, String userType, String userCompellation, Long phone, String unionId, String userInfo, Date lastTime, Integer delstatus, Date createTime) {
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.userType = userType;
        this.userCompellation = userCompellation;
        this.phone = phone;
        this.unionId = unionId;
        this.userInfo = userInfo;
        this.lastTime = lastTime;
        this.delstatus = delstatus;
        this.createTime = createTime;
    }

    public String getUserCompellation() {
        return userCompellation;
    }

    public void setUserCompellation(String userCompellation) {
        this.userCompellation = userCompellation;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUnionId() {
        return unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(String userInfo) {
        this.userInfo = userInfo;
    }

    public Integer getDelstatus() {
        return delstatus;
    }

    public void setDelstatus(Integer delstatus) {
        this.delstatus = delstatus;
    }

    public Date getLastTime() {
        return lastTime;
    }

    public void setLastTime(Date lastTime) {
        this.lastTime = lastTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
