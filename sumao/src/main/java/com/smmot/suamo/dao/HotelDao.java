package com.smmot.suamo.dao;


import com.smmot.suamo.core.basedao.GatherMapper;
import com.smmot.suamo.entity.Hotel;

import java.util.List;

public interface HotelDao extends GatherMapper<Hotel> {

    public List<Hotel> selectListAndMinPrice();

    public Hotel selectOneHotelAll(Hotel hotel);
}
