package com.mall.service;

import com.mall.bean.Factory;

public interface FactoryService extends BaseService {
    Factory factorylogin (String phonenum,String password);
}
