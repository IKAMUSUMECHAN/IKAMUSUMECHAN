package com.mall.service.impl;


import com.mall.bean.Cart;
import com.mall.dao.CartDao;
import com.mall.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {
    @Autowired
    private CartDao cartDao;
    @Autowired
    private RedisTemplate redisTemplate;
    @Override
    public void save(Object obj) {
        cartDao.save(obj);
    }

    @Override
    public void removeById(Long id) {
        cartDao.removeById(id);
        Boolean key_exist = redisTemplate.hasKey("cart-"+id);
        if (key_exist) {
            redisTemplate.delete("cart-"+id);
        }
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
    public List<Cart> getcartbyuserid(Long userid) {
        List a=cartDao.getcartbyuserid(userid);
        return a;
    }
}
