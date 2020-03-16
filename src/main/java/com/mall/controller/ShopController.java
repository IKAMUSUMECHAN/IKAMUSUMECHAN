package com.mall.controller;

import com.mall.bean.Shop;
import com.mall.service.ShopService;
import com.mall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

/*商铺Controller*/

@RequestMapping(value="/shop",produces = "application/json; charset=utf-8")
public class ShopController {
    @Autowired
    private ShopService shopService;
    @Autowired
    private GoodsService goodsService;
    //根据店铺id获得店铺信息
    @GetMapping("getShopById/id={id}")
    public Shop getShopByid(@PathVariable("id")Long id){return (Shop) shopService.getById(id);}
    //删除店铺
    @GetMapping("removeShopById/sid={id}")
    public void removeShopById (@PathVariable("id") Long id){shopService.removeById(id);}
    //获得店铺
    @GetMapping("GetGoodsIdByShopId/sid={sid}")
    public String GetGoodsIdByShopId(@PathVariable("sid")Long sid){return  goodsService.GetGoodsIdByShopId(sid);}
    @GetMapping("getshopbygid/gid={gid}")
    public Shop getshopbygid(@PathVariable("gid")Long gid){return  shopService.getshopbygid(gid);}
    //新增店铺
    @GetMapping("addnewshop/shop")
    public Shop addnewshop(Shop shop){
        Shop shop1=null;
        shopService.save(shop);
        shop1= (Shop) shopService.getById(shop.getId());
        return shop1;
    }
    //修改店铺
    @GetMapping("updateShopById/Shop")
    public Shop updateShopById (Shop shop){
        Shop shop1=null;
        shopService.update(shop);
        shop1= (Shop) shopService.getById(shop.getId());
        return shop1;
    }
    //登录店铺
    @GetMapping("shoplogin/Shop")
    public Shop shoplongin(Shop shop){
        Shop shop1=null;
        shop1= shopService.shoplogin(shop.getShopphonenumber(),shop.getShoppassword());
        return shop1;
    }
}
