package com.smmot.suamo.controller;

import com.smmot.suamo.entity.Hotel;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

public interface HotelController {


    /**
     * 查询所有酒店
     * @param response
     * @param request
     */
    public void showHotels(HttpServletResponse response, HttpServletRequest request);

    /**
     * 根据条件查询一个酒店的全部信息
     * @param hotel
     * @param response
     * @param request
     */
    public void selectOneHotelAll(Hotel hotel,HttpServletResponse response, HttpServletRequest request);


    public String test();
}
