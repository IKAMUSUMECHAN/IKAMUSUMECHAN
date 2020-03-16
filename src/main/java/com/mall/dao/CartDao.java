package com.mall.dao;

import com.mall.bean.Cart;

import java.util.List;

public interface CartDao extends BaseDao {
    List<Cart> getcartbyuserid(Long userid);
}
