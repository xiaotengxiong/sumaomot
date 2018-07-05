package com.smmot.suamo.service.impl;

import com.smmot.suamo.dao.PriceDao;
import com.smmot.suamo.entity.Price;
import com.smmot.suamo.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PriceServiceImpl implements PriceService {
    @Autowired
    private PriceDao priceDao;

    @Override
    public Integer insert(Price price) {
        return null;
    }

    @Override
    public Integer logicalDeletion(Price price) {
        return null;
    }

    @Override
    public Integer update(Price price) {
        return null;
    }

    @Override
    public List<Price> selectList() {
        return priceDao.selectList();
    }

    @Override
    public List<Price> selectList(Price price) {
        return priceDao.selectList(price);
    }

    @Override
    public Price selectOne(Price price) {
        return null;
    }


    @Override
    public List<Price> selectListALLMsg(Price price) {
        return priceDao.selectListALLMsg(price);
    }

    @Override
    public Price selectOneByPriceId(Price price) {
        return priceDao.selectOneByPriceId(price);
    }
}
