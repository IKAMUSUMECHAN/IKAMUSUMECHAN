package com.mall.service;

import com.mall.bean.Useraddress;
import com.mall.dao.BaseDao;

import java.util.List;

public interface UseraddressService extends BaseDao {
    List<Useraddress> getuseraddressbyid(Long id);
}
