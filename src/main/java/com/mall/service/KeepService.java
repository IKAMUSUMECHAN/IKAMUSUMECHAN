package com.mall.service;

import com.mall.bean.Keep;
import com.mall.dao.BaseDao;

import java.util.List;

public interface KeepService extends BaseService {
    List<Keep> getkeepbyuserid(Long userid);
}
