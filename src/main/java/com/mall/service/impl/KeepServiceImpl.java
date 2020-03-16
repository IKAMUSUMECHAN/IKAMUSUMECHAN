package com.mall.service.impl;

import com.mall.bean.Keep;
import com.mall.dao.KeepDao;
import com.mall.service.KeepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KeepServiceImpl implements KeepService {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private KeepDao keepDao;
    @Override
    public void save(Object obj) {
        keepDao.save(obj);
    }

    @Override
    public void removeById(Long id) {
        keepDao.removeById(id);
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
        List<Object> a;
        a=keepDao.listAll();
        return a;
    }

    @Override
    public Long count() {
        return null;
    }

    @Override
    public List<Keep> getkeepbyuserid(Long userid) {
        List a=keepDao.getkeepbyuserid(userid);
        return a;
    }
}
