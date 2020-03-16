package com.mall.service.impl;

import com.mall.bean.Shop;
import com.mall.dao.ShopDao;
import com.mall.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService {
    @Autowired
    private ShopDao shopDao;
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void save(Object obj) {
        //因添加数据时获取不到id，无法将此obj设置到缓存中，所以直接将数据保存在数据库中即可
        shopDao.save(obj);
    }

    //删除商铺
    @Override
    public void removeById(Long id) {
        String a=null;
        shopDao.removeById(id);
        Boolean key_exist = redisTemplate.hasKey("shop-"+id);
        if (key_exist) {
            redisTemplate.delete("shop-"+id);
        }
        Shop shop = null;
        shop = (Shop) shopDao.getById(id);
        if (shop == null) {
            a="success";
            if (shop != null) {
                a="false";
            }
        }

    }



    @Override
    public void update(Object obj) {
        //先修改数据库中的值
        shopDao.update(obj);
        //查询缓存中是否有此数据值
        ValueOperations<String, Shop> valueOperations = redisTemplate.opsForValue();
        Shop shop = (Shop) obj;
        Shop shop1 = valueOperations.get("shop-"+ shop.getId());
        //若存在此数据则重新设置缓存值
        if(shop1!=null){
            valueOperations.set("shop-"+shop.getId(),shop);
        }
    }
//获取店铺
    @Override
    public Object getById(Long id) {
        Shop shop = null;
        shop = (Shop) shopDao.getById(id);
        System.out.println(shop);
        return shop;
    }

    @Override
    public List<Object> listAll() {
        return null;
    }


    @Override
    public Long count() {
        return shopDao.count();
    }

    //商铺登录
    @Override
    public Shop shoplogin(String phonenum,Long password) {
        Shop shop=null;
        shop= shopDao.shoplogin(phonenum);
        if(shop.getShoppassword()==password)
        {return shop;}
        else return null;
    }

    @Override
    public Shop getshopbygid(Long gid) {
        return shopDao.getshopbygid(gid);
    }
}