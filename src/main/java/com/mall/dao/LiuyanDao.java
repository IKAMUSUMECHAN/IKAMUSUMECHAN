package com.mall.dao;

import com.mall.bean.Liuyan;

import java.util.List;

public interface LiuyanDao extends BaseDao {
    List<Liuyan> getliuyanbygid(Long gid);
    List<Liuyan> getliuyanbyuserid(Long userid);
}
