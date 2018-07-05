package com.smmot.suamo.service.impl;

import com.smmot.suamo.dao.PirtureDao;
import com.smmot.suamo.entity.Pirture;
import com.smmot.suamo.service.PirtureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PirtureServiceImpl implements PirtureService {
    @Autowired
    private PirtureDao pirtureDao;

    @Override
    public Integer insert(Pirture pirture) {
        return null;
    }

    @Override
    public Integer logicalDeletion(Pirture pirture) {
        return null;
    }

    @Override
    public Integer update(Pirture pirture) {
        return null;
    }

    @Override
    public List<Pirture> selectList() {
        return null;
    }

    @Override
    public List<Pirture> selectList(Pirture pirture) {
        return pirtureDao.selectList(pirture);
    }

    @Override
    public Pirture selectOne(Pirture pirture) {
        return null;
    }
}
