package com.mall.service;

import com.mall.bean.User;

public interface UserService extends BaseService {
    User userlogin (Long userphonenum ,String userpassword);
}
