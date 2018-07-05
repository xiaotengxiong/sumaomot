package com.smmot.suamo.controller;

import com.smmot.suamo.core.BaseController;
import com.smmot.suamo.entity.Order;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface OrderController{

    public void insertOrder(Order order,HttpServletResponse response, HttpServletRequest request);

}
