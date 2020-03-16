package com.mall.service;

import com.mall.bean.Cart;

import java.util.List;

public interface CartService extends BaseService {
    List<Cart> getcartbyuserid(Long userid);
}
