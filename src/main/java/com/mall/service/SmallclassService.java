package com.mall.service;

import com.mall.bean.Smallclass;

import java.util.List;

public interface SmallclassService extends BaseService {
    List<Object> getsmallclassbygroup(Long iid);
}
