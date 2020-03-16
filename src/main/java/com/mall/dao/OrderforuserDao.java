package com.mall.dao;


import com.mall.bean.Orderforuser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderforuserDao extends BaseDao {
    List<Orderforuser> getuserorderbystate(@Param("userid") Long userid, @Param("orderstate") String orderstate);
    List<Orderforuser> getalluserorderbyuid(Long userid);
    List<Orderforuser> getuserorderbytime(String ordertime);
    Long countorder(@Param("shopid") Long shopid, @Param("orderstate") String orderstate);
    Long countorderbytime(@Param("shopid") Long shopid, @Param("ordertime") String ordertime);
    Long orderpricesum(@Param("shopid") Long shopid, @Param("ordertime") String ordertime);
    Long fukuansum(Long shopid);
}