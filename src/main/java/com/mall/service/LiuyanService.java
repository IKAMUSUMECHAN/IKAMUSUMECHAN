package com.mall.service;

import com.mall.bean.Liuyan;

import java.util.List;

public interface LiuyanService extends BaseService {
    List<Liuyan> getliuyanbygid(Long gid);
    List<Liuyan> getliuyanbyuserid(Long userid);
}
