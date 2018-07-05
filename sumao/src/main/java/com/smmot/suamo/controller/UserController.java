package com.smmot.suamo.controller;

import com.smmot.suamo.entity.Order;
import com.smmot.suamo.entity.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface UserController {

    /**
     * 查询所有用户
     * @param response
     * @param request
     */
    public void selectUserList(HttpServletResponse response, HttpServletRequest request);

    /**
     * 根据条件查询用户
     * @param u
     * @param response
     * @param request
     */
    public void selectUserByCondition(User u , HttpServletResponse response, HttpServletRequest request);

    /**
     * 根据条件查询用户
     * @param u
     * @param response
     * @param request
     */
    public void selectUserByOrder(User u, HttpServletResponse response, HttpServletRequest request);

}
