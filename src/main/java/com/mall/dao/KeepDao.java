package com.mall.dao;

import com.mall.bean.Keep;

import java.util.List;

public interface KeepDao extends BaseDao {
    List<Keep> getkeepbyuserid(Long userid);
}
