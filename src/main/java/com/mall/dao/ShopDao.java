package com.mall.dao;

import com.mall.bean.Shop;

public interface ShopDao extends BaseDao {
    Shop shoplogin (String phonenum);
    Shop getshopbygid(Long gid);
}
