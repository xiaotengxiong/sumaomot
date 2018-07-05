package com.smmot.suamo.service;

import com.smmot.suamo.core.baseservice.BaseService;
import com.smmot.suamo.entity.Price;

import java.util.List;

public interface PriceService extends BaseService<Price> {

    public List<Price> selectListALLMsg(Price price);

    public Price selectOneByPriceId(Price price);
}
