package com.mall.service;

import com.mall.bean.Goods;

import java.util.List;

public interface GoodsService extends BaseService {
    String GetGoodsIdByShopId(Long sid);
    List<Goods> SearchGoodsByGoodsName(String name);
    List<Goods> getgoodsbycateid(Integer gCateId);
    List<Goods> getgoodsbybigclassid(Long bigclassid);
    List<Goods> getgoodsbysid(Long sid);
}
