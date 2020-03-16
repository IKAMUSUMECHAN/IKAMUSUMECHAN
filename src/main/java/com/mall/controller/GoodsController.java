package com.mall.controller;

import com.google.gson.Gson;
import com.mall.bean.Goods;
import com.mall.service.BigclassService;
import com.mall.service.GoodsService;
import com.mall.service.SmallclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController

/*商铺Controller*/

@RequestMapping(value="/goods",produces = "application/json; charset=utf-8")
public class GoodsController {
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private BigclassService bigclassService;
    @Autowired
    private SmallclassService smallclassService;
    //根据商品id获得商品信息
    @GetMapping("getGoodsByGId/Gid={id}")
    public Goods getGoodsByid(@PathVariable("id")Long id){return (Goods) goodsService.getById(id);}

    @GetMapping("removeGoodsByGId/Gid={id}")
    public void removeShopById (@PathVariable("id") Long id){goodsService.removeById(id);}

    @GetMapping("SearchGoodsByGoodsName/Gname={name}")
    public List<Goods> SearchGoodsByGoodsName(@PathVariable("name")String name){
        return  goodsService.SearchGoodsByGoodsName(name);
    }

    //根据小类获取商品
    @GetMapping("getgoodsbycateid/gCateId={gCateId}")
    public List<Goods> getgoodsbycateid(@PathVariable("gCateId")Integer gCateId){return goodsService.getgoodsbycateid(gCateId);}

    //根据大类获取商品
    @GetMapping("getgoodsbybigclassid/bigclassid={bigclassid}")
    public List<Goods> getgoodsbybigclassid(@PathVariable("bigclassid")Long bigclassid){return goodsService.getgoodsbybigclassid(bigclassid);}
    //新增商品
    @GetMapping("addnewgoods/goods")
    public Goods addnewshop(Goods goods){
        Goods goods1=null;
        System.out.println(goods);
        goodsService.save(goods);
        goods1= (Goods) goodsService.getById(goods.getGId());
        return goods1;
    }
    //修改商品信息
    @GetMapping("updateGoodsById/Goods")
    public Goods updateGoodsById (Goods goods){
        Goods goods1=null;
        goodsService.update(goods);
        goods1= (Goods) goodsService.getById(goods.getGId());
        return goods1;
    }

    //大分类
    @GetMapping("getallbigclass")
    public List<Object> listBigclass () {
        List<Object> bigclass = bigclassService.listAll();
        System.out.println(bigclass);
        return bigclass;
    }
    //小分类
    @GetMapping("getallsmallclass")
    public List<Object> listSmallclass () {
        //List<Object> smallclass = smallclassService.listAll();
        long a=1;
        Gson gs = new Gson();
        List<Object> smallclass = new ArrayList<Object>();
        for(long n=1;n<=8;n++) {
            smallclass.add(smallclassService.getsmallclassbygroup(n));
        }
        System.out.println(smallclass);
        return smallclass;
    }

    @GetMapping("getgoodsbysid/sid={sid}")
    public List<Goods> getgoodsbysid(@PathVariable("sid")Long sid){return  goodsService.getgoodsbysid(sid);}
}
