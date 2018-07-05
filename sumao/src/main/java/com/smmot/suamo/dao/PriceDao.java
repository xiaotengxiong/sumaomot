package com.smmot.suamo.dao;

import com.smmot.suamo.core.basedao.GatherMapper;
import com.smmot.suamo.entity.Price;

import java.util.List;

public interface PriceDao extends GatherMapper <Price>{

    public List<Price> selectListALLMsg(Price price);

    public Price selectOneByPriceId(Price price);

}
