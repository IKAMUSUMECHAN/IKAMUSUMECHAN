package com.mall.service.impl;

import com.mall.bean.Orderforshop;
import com.mall.dao.OrderforshopDao;
import com.mall.service.OrderforshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderforshopServiceImpl implements OrderforshopService {
    @Autowired
    private OrderforshopDao orderforshopDao;
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void save(Object obj) {
        //因添加数据时获取不到id，无法将此obj设置到缓存中，所以直接将数据保存在数据库中即可
        orderforshopDao.save(obj);
    }

    //删除商铺
    @Override
    public void removeById(Long id) {
        String a=null;
        orderforshopDao.removeById(id);
        //先判断缓存中是否存在此键 key,若存在则删除此键
        Boolean key_exist = redisTemplate.hasKey("orderforshop-"+id);
        if (key_exist) {
            redisTemplate.delete("orderforshop-"+id);
        }

        Orderforshop orderforshop = null;
        orderforshop = (Orderforshop) orderforshopDao.getById(id);
        if (orderforshop == null) {
            a="success";
            if (orderforshop != null) {
                a="false";
            }
        }

    }



    @Override
    public void update(Object obj) {
        //先修改数据库中的值
        orderforshopDao.update(obj);
        //查询缓存中是否有此数据值
        ValueOperations<String, Orderforshop> valueOperations = redisTemplate.opsForValue();
        Orderforshop orderforshop = (Orderforshop) obj;
    }

    //根据订单号获取订单
    @Override
    public Object getById(Long ordernumber) {
        Orderforshop orderforshop = null;
        orderforshop = (Orderforshop) orderforshopDao.getById(ordernumber);
        System.out.println(orderforshop);
        return orderforshop;
    }

    @Override
    public List<Object> listAll() {
        List<Object> orderforshopList = new ArrayList<>();
        List<Object> detailsList = new ArrayList<>();
        Long countAll = this.count();
        //从数据库中获取数据
        orderforshopList = orderforshopDao.listAll();

        return orderforshopList;
    }


    @Override
    public Long count() {
        return orderforshopDao.count();
    }


    @Override
    public List<Orderforshop> getorderbystate(Long firmid,String orderstate) {
        List orderforshop=null;
        System.out.println(firmid);
        orderforshop=orderforshopDao.getorderbystate(firmid,orderstate);
        return orderforshop;
    }

    @Override
    public List<Orderforshop> getallorderbyfid(Long firmid) {
        List order=null;
        order=orderforshopDao.getallorderbyfid(firmid);
        return order;
    }

    @Override
    public List<Orderforshop> getorderbytime(String ordertime) {
        List order=null;
        order=orderforshopDao.getorderbytime(ordertime);
        return order;
    }
}