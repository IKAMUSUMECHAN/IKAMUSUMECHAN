package com.mall.dao;

import com.mall.bean.Useraddress;

import java.util.List;

public interface UseraddressDao extends BaseDao {
    List<Useraddress> getuseraddressbyid(Long userid);
}
