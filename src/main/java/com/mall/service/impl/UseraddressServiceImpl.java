package com.mall.service.impl;

import com.mall.bean.Useraddress;
import com.mall.dao.UseraddressDao;
import com.mall.service.UseraddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UseraddressServiceImpl implements UseraddressService {
    @Autowired
    private UseraddressDao useraddressDao;
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void save(Object obj) {
        useraddressDao.save(obj);
    }

    @Override
    public void removeById(Long id) {
        String a=null;
        useraddressDao.removeById(id);
        Boolean key_exist = redisTemplate.hasKey("useraddress-"+id);
        if (key_exist) {
            redisTemplate.delete("useraddress-"+id);
        }
        Useraddress useraddress = null;
        useraddress = (Useraddress) useraddressDao.getById(id);
        if (useraddress == null) {
            a="success";
            if (useraddress != null) {
                a="false";
            }
        }

    }

    @Override
    public void update(Object obj) {
        //先修改数据库中的值
        useraddressDao.update(obj);
        //查询缓存中是否有此数据值
        ValueOperations<String, Useraddress> valueOperations = redisTemplate.opsForValue();
        Useraddress useraddress = (Useraddress) obj;
        Useraddress useraddress1 = valueOperations.get("useraddress-"+ useraddress.getAddressid());
        //若存在此数据则重新设置缓存值
        if(useraddress1!=null){
            valueOperations.set("useraddress-"+useraddress.getAddressid(),useraddress);
        }
    }

    @Override
    public Object getById(Long id) {
        Useraddress useraddress = null;
        useraddress = (Useraddress) useraddressDao.getById(id);
        System.out.println(useraddress);
        return useraddress;
    }

    @Override
    public List<Object> listAll() {
        List<Object> useraddressList;
        //从数据库中获取数据
        useraddressList = useraddressDao.listAll();
        return useraddressList;
    }

    @Override
    public Long count() {
        return null;
    }

    @Override
    public List<Useraddress> getuseraddressbyid(Long userid) {
        List<Useraddress> useraddress;
        useraddress=useraddressDao.getuseraddressbyid(userid);
        return useraddress;
    }
}
