package com.mall.service.impl;

import com.mall.bean.Liuyan;
import com.mall.dao.LiuyanDao;
import com.mall.service.LiuyanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LiuyanServiceImpl implements LiuyanService {
    @Autowired
    LiuyanDao liuyanDao;
    @Override
    public void save(Object obj) {
        liuyanDao.save(obj);
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
        return null;
    }

    @Override
    public Long count() {
        return null;
    }

    @Override
    public List<Liuyan> getliuyanbygid(Long gid) {
        List a=liuyanDao.getliuyanbygid(gid);
        return a;
    }

    @Override
    public List<Liuyan> getliuyanbyuserid(Long userid) {
        List a=liuyanDao.getliuyanbyuserid(userid);
        return a;
    }
}
