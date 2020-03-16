package com.mall.dao;

import com.mall.bean.Orderforshop;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderforshopDao extends BaseDao {
    List<Orderforshop> getorderbystate (@Param("firmid") Long firmid, @Param("orderstate") String orderstate);
    List<Orderforshop> getallorderbyfid (Long firmid);
    List<Orderforshop> getorderbytime (String ordertime);
}
