package com.smmot.suamo.service.impl;

import com.smmot.suamo.dao.UserDao;
import com.smmot.suamo.entity.User;
import com.smmot.suamo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao  userDao;

    @Override
    public Integer insert(User user) {
        return null;
    }

    @Override
    public Integer logicalDeletion(User user) {
        return null;
    }

    @Override
    public Integer update(User user) {
        return null;
    }

    @Override
    public User selectOne(User user) {
        return userDao.selectOne(user);
    }

    @Override
    public List<User> selectList(User user) {
        return userDao.selectList();
    }

    @Override
    public List<User> selectList() {
        return userDao.selectList();
    }

}
