package com.smmot.suamo.service.impl;

import com.smmot.suamo.dao.HotelDao;
import com.smmot.suamo.entity.Hotel;
import com.smmot.suamo.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HotelServiceImpl  implements HotelService {
   @Autowired
   private HotelDao hotelDao;


    @Override
    public Integer insert(Hotel hotel) { return hotelDao.insert(hotel); }

    @Override
    public Integer logicalDeletion(Hotel hotel) {
        return hotelDao.logicalDeletion(hotel);
    }

    @Override
    public Integer update(Hotel hotel) {
        return hotelDao.update(hotel);
    }

    @Override
    public Hotel selectOne(Hotel hotel) {
        return hotelDao.selectOne(hotel);
    }

    @Override
    public List<Hotel> selectList(Hotel hotel) {
        return hotelDao.selectList(hotel);
    }

    @Override
    public List<Hotel> selectList() {
        return hotelDao.selectList();
    }

    @Override
    public  List<Hotel> selectListAndMinPrice() {
        return hotelDao.selectListAndMinPrice();
    }

    @Override
    public Hotel selectOneHotelAll(Hotel hotel) {
        return hotelDao.selectOneHotelAll(hotel);
    }
}
