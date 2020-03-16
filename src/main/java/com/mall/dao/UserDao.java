package com.mall.dao;

import com.mall.bean.User;

public interface UserDao extends BaseDao{
    User userlogin (Long userphonenum);
}
