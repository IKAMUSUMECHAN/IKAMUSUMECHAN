package com.mall.service.impl;

import com.mall.bean.Huilv;
import com.mall.dao.HuilvDao;
import com.mall.service.HuilvService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HuilvServiceImpl implements HuilvService {
    @Autowired
    private HuilvDao huilvDao;
    @Override
    public void save(Object obj) {

    }

    @Override
    public void removeById(Long id) {

    }

    @Override
    public void update(Object obj) {

    }

    @Override
    public Object getById(Long id) {
        return null;
    }

    @Override
    public List<Object> listAll() {
        List a=huilvDao.listAll();
        return a;
    }

    @Override
    public Long count() {
        return null;
    }
}
