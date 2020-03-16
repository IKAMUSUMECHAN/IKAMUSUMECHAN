package com.mall.service.impl;

import com.mall.bean.Orderforuser;
import com.mall.dao.OrderforuserDao;
import com.mall.service.OrderforuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderforuserServiceImpl implements OrderforuserService {
    @Autowired
    private OrderforuserDao orderforuserDao;
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void save(Object obj) {
        orderforuserDao.save(obj);
    }

    //删除商铺
    @Override
    public void removeById(Long id) {
        String a=null;
        orderforuserDao.removeById(id);
        //先判断缓存中是否存在此键 key,若存在则删除此键
        Boolean key_exist = redisTemplate.hasKey("orderforuser-"+id);
        if (key_exist) {
            redisTemplate.delete("orderforuser-"+id);
        }

        Orderforuser orderforuser = null;
        orderforuser = (Orderforuser) orderforuserDao.getById(id);
        if (orderforuser == null) {
            a="success";
            if (orderforuser != null) {
                a="false";
            }
        }

    }



    @Override
    public void update(Object obj) {
        //先修改数据库中的值
        orderforuserDao.update(obj);
        //查询缓存中是否有此数据值
        ValueOperations<String, Orderforuser> valueOperations = redisTemplate.opsForValue();
        Orderforuser orderforuser = (Orderforuser) obj;
    }

    //根据订单号获取订单
    @Override
    public Object getById(Long ordernumber) {
        Orderforuser orderforuser = null;
        orderforuser = (Orderforuser) orderforuserDao.getById(ordernumber);
        System.out.println(orderforuser);
        return orderforuser;
    }

    @Override
    public List<Object> listAll() {
        List<Object> orderforuserList = new ArrayList<>();
        List<Object> detailsList = new ArrayList<>();
        Long countAll = this.count();
        //从数据库中获取数据
        orderforuserList = orderforuserDao.listAll();

        return orderforuserList;
    }


    @Override
    public Long count() {
        return orderforuserDao.count();
    }


    @Override
    public List<Orderforuser> getuserorderbystate(Long userid, String orderstate) {
        List orderforuser=null;
        System.out.println(userid);
        orderforuser=orderforuserDao.getuserorderbystate(userid,orderstate);
        return orderforuser;
    }

    @Override
    public List<Orderforuser> getalluserorderbyuid(Long userid) {
        List order=null;
        order=orderforuserDao.getalluserorderbyuid(userid);
        return order;
    }

    @Override
    public List<Orderforuser> getuserorderbytime(String ordertime) {
        List order=null;
        order=orderforuserDao.getuserorderbytime(ordertime);
        return order;
    }

    @Override
    public Long countorder(Long shopid, String orderstate) {
        return orderforuserDao.countorder(shopid,orderstate);
    }

    @Override
    public Long countorderbytime(Long shopid, String ordertime) {
        return orderforuserDao.countorderbytime(shopid,ordertime);
    }

    @Override
    public Long orderpricesum(Long shopid, String ordertime) {
        return orderforuserDao.orderpricesum(shopid,ordertime);
    }

    @Override
    public Long fukuansum(Long shopid) {
        return orderforuserDao.fukuansum(shopid);
    }
}