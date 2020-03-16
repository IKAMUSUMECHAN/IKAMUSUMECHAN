package com.mall.service.impl;

import com.mall.bean.Factory;
import com.mall.dao.FactoryDao;
import com.mall.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class FactoryServiceImpl implements FactoryService {
    @Autowired
    private FactoryDao factoryDao;
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void save(Object obj) {
        //因添加数据时获取不到id，无法将此obj设置到缓存中，所以直接将数据保存在数据库中即可
        factoryDao.save(obj);
    }

    //删除商铺
    @Override
    public void removeById(Long id) {
        String a=null;
        factoryDao.removeById(id);
        Boolean key_exist = redisTemplate.hasKey("factory-"+id);
        if (key_exist) {
            redisTemplate.delete("factory-"+id);
        }
        Factory factory = null;
        factory = (Factory) factoryDao.getById(id);
        if (factory == null) {
            a="success";
            if (factory != null) {
                a="false";
            }
        }

    }



    @Override
    public void update(Object obj) {
        //先修改数据库中的值
        factoryDao.update(obj);
        //查询缓存中是否有此数据值
        ValueOperations<String, Factory> valueOperations = redisTemplate.opsForValue();
        Factory factory = (Factory) obj;
        Factory factory1 = valueOperations.get("factory-"+ factory.getId());
        //若存在此数据则重新设置缓存值
        if(factory1!=null){
            valueOperations.set("factory-"+factory.getId(),factory);
        }
    }
//获取店铺
    @Override
    public Object getById(Long id) {
        Factory factory = null;
        factory = (Factory) factoryDao.getById(id);
        System.out.println(factory);
        return factory;
    }

    @Override
    public List<Object> listAll() {
        return null;
    }


    @Override
    public Long count() {
        return factoryDao.count();
    }

    //商铺登录
    @Override
    public Factory factorylogin(String phonenum,String password) {
        Factory factory=null;
        factory= factoryDao.factorylogin(phonenum);
        if(Objects.equals(password, factory.getFactorypassword()))
        {return factory;}
        else return null;
    }


}