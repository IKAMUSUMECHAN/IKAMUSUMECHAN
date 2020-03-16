package com.mall.service;

import com.mall.bean.Orderforshop;

import java.util.List;

public interface OrderforshopService extends BaseService {
    List<Orderforshop> getorderbystate (Long firmid, String orderstate);
    List<Orderforshop> getallorderbyfid (Long firmid);
    List<Orderforshop> getorderbytime (String ordertime);
}
