package com.mall.service;


import com.mall.bean.Orderforuser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderforuserService extends BaseService {
    List<Orderforuser> getuserorderbystate(Long userid, String orderstate);
    List<Orderforuser> getalluserorderbyuid(Long userid);
    List<Orderforuser> getuserorderbytime(String ordertime);
    Long countorder(@Param("shopid") Long shopid, @Param("orderstate") String orderstate);
    Long countorderbytime(@Param("shopid") Long shopid, @Param("ordertime") String ordertime);
    Long orderpricesum(@Param("shopid") Long shopid, @Param("ordertime") String ordertime);
    Long fukuansum(Long shopid);
}
