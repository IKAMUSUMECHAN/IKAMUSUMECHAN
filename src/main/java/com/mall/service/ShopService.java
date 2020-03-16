package com.mall.service;

import com.mall.bean.Shop;

public interface ShopService extends BaseService {
    Shop shoplogin (String phonenum,Long password);
    Shop getshopbygid(Long gid);
}
