package com.mall.controller;

import com.mall.bean.Orderforshop;
import com.mall.bean.Orderforuser;
import com.mall.bean.Shop;
import com.mall.service.OrderforshopService;
import com.mall.service.OrderforuserService;
import com.mall.service.ShopService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/order",produces = "application/json; charset=utf-8")

public class OrderController {
    @Autowired
    private OrderforshopService orderforshopService;
    @Autowired
    private OrderforuserService orderforuserService;

    //根据订单num获得s订单信息
    @GetMapping("getOrderforshopByOrdernumber/ordernumber={ordernumber}")
    public Orderforshop getOrderforshopByOrdernumber(@PathVariable("ordernumber")Long ordernumber){
        return (Orderforshop) orderforshopService.getById(ordernumber);
    }

    //根据订单状态获取s订单信息
    @GetMapping("getOrderforshopByOrderstate/firmid={firmid}/orderstate={orderstate}")
    public List<Orderforshop> getOrderforshopByOrderstate(@PathVariable("firmid") Long firmid, @PathVariable("orderstate") String orderstate)
    {
        System.out.println(firmid);
        System.out.println(orderstate);
        return orderforshopService.getorderbystate(firmid,orderstate);
    }
    //根据fid查询alls订单
    @GetMapping("getallorderbyfid/firmid={firmid}")
    public List<Orderforshop> getallorderbyfid(@PathVariable("firmid") Long firmid)
    {
        return orderforshopService.getallorderbyfid(firmid);
    }
    //根据time查询s订单
    @GetMapping("getorderbytime/ordertime={ordertime}")
    public List<Orderforshop> getorderbytime(@PathVariable("ordertime") String ordertime)
    {
        return orderforshopService.getorderbytime(ordertime);
    }


    //根据订单num获得u订单信息
    @GetMapping("getOrderforuserByOrdernumber/ordernumber={ordernumber}")
    public Orderforuser getOrderforuserByOrdernumber(@PathVariable("ordernumber")Long ordernumber){
        return (Orderforuser) orderforuserService.getById(ordernumber);
    }

    //根据订单状态获取u订单信息
    @GetMapping("getOrderforuserByOrderstate/userid={userid}/orderstate={orderstate}")
    public List<Orderforuser> getOrderforuserByOrderstate(@PathVariable("userid") Long userid, @PathVariable("orderstate") String orderstate)
    {
        System.out.println(userid);
        System.out.println(orderstate);
        return orderforuserService.getuserorderbystate(userid,orderstate);
    }
    //根据fid查询allu订单
    @GetMapping("getalluserorderbyuid/userid={userid}")
    public List<Orderforuser> getalluserorderbyfid(@PathVariable("userid") Long userid)
    {
        return orderforuserService.getalluserorderbyuid(userid);
    }
    //根据time查询u订单
    @GetMapping("getuserorderbytime/ordertime={ordertime}")
    public List<Orderforuser> getuserorderbytime(@PathVariable("ordertime") String ordertime)
    {
        return orderforuserService.getuserorderbytime(ordertime);
    }
    //根据订单状态shopid获取u订单shu
    @GetMapping("countorder/shopid={shopid}/orderstate={orderstate}")
    public Long countorder(@PathVariable("shopid") Long shopid, @PathVariable("orderstate") String orderstate)
    {
        Long a=orderforuserService.countorder(shopid,orderstate);
        System.out.println("a是"+a);
        return a;
    }

    @GetMapping("countorderbytime/shopid={shopid}/ordertime={ordertime}")
    public Long countorderbytime(@PathVariable("shopid") Long shopid, @PathVariable("ordertime") String ordertime)
    {
        Long a=orderforuserService.countorderbytime(shopid,ordertime);
        System.out.println("a是"+a);
        return a;
    }
    @GetMapping("orderpricesum/shopid={shopid}/ordertime={ordertime}")
    public Long orderpricesum(@PathVariable("shopid") Long shopid, @PathVariable("ordertime") String ordertime)
    {
        Long a=orderforuserService.orderpricesum(shopid,ordertime);
        System.out.println("a是"+a);
        return a;
    }

    @GetMapping("fukuansum/shopid={shopid}")
    public Long fukuansum(@PathVariable("shopid") Long shopid)
    {
        Long a=orderforuserService.fukuansum(shopid);
        System.out.println("a是"+a);
        return a;
    }

    //下单
    @GetMapping("addnewuserorder/orderforuser")
    public Orderforuser addnewshop(Orderforuser orderforuser){
        Orderforuser orderforuser1=null;
        orderforuserService.save(orderforuser);
        return orderforuser1;
    }

}
