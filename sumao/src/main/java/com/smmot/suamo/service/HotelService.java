package com.smmot.suamo.service;

import com.smmot.suamo.core.baseservice.BaseService;
import com.smmot.suamo.entity.Hotel;

import java.util.List;

public interface HotelService extends BaseService<Hotel> {

    public List<Hotel> selectListAndMinPrice();

    public Hotel selectOneHotelAll(Hotel hotel);
}
