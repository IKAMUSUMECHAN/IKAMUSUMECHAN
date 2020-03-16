package com.mall.dao;

import com.mall.bean.Goods;

import java.util.List;

public interface GoodsDao  extends BaseDao {

    List<Goods> GetGoodsIdByShopId(Long sid);
    /**
     * 一个Dao层对应一个mapper xml 你的xml  resultmap 是 Goods类
     * 这里返回就要对应的类
     * 方法名同样要对应
     * 严格来说  xml文件名都要跟dao层对应
     * * */
    List<Goods> SearchGoodsByGoodsName(String name);
    List<Goods> getgoodsbycateid(Integer gCateId);
    List<Goods> getgoodsbybigclassid(Long bigclassid);
    List<Goods> getgoodsbysid(Long sid);
}
