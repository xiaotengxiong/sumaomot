package com.smmot.suamo.service.impl;

import com.smmot.suamo.dao.OrderDao;
import com.smmot.suamo.entity.Order;
import com.smmot.suamo.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public Integer insert(Order order) {
        return orderDao.insert(order);
    }

    @Override
    public Integer logicalDeletion(Order order) {
        return null;
    }

    @Override
    public Integer update(Order order) {
        return null;
    }

    @Override
    public List<Order> selectList() {
        return null;
    }

    @Override
    public List<Order> selectList(Order order) {
        return null;
    }

    @Override
    public Order selectOne(Order order) {
        return null;
    }
}
