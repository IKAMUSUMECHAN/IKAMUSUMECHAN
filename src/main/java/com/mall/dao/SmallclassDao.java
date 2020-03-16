package com.mall.dao;

import com.mall.bean.Smallclass;

import java.util.List;

public interface SmallclassDao extends BaseDao {
    List<Object> getsmallclassbygroup(Long iid);
}
