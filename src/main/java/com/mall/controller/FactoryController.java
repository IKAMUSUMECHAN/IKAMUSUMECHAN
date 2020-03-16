package com.mall.controller;

import com.mall.bean.Factory;
import com.mall.service.GoodsService;
import com.mall.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

/*商铺Controller*/

@RequestMapping(value="/factory",produces = "application/json; charset=utf-8")
public class FactoryController {
    @Autowired
    private FactoryService factoryService;
    @Autowired
    private GoodsService goodsService;
    //根据店铺id获得店铺信息
    @GetMapping("getFactoryById/id={id}")
    public Factory getFactoryByid(@PathVariable("id")Long id){return (Factory) factoryService.getById(id);}
    //删除店铺
    @GetMapping("removeFactoryById/sid={id}")
    public void removeFactoryById (@PathVariable("id") Long id){factoryService.removeById(id);}

    //新增店铺
    @GetMapping("addnewfactory/factory")
    public Factory addnewfactory(Factory factory){
        Factory factory1=null;
        factoryService.save(factory);
        factory1= (Factory) factoryService.getById(factory.getId());
        return factory1;
    }
    //修改店铺
    @GetMapping("updateFactoryById/Factory")
    public Factory updateFactoryById (Factory factory){
        Factory factory1=null;
        factoryService.update(factory);
        factory1= (Factory) factoryService.getById(factory.getId());
        return factory1;
    }
    //登录店铺
    @GetMapping("factorylogin/Factory")
    public Factory factorylongin(Factory factory){
        Factory factory1=null;
        factory1= factoryService.factorylogin(factory.getFactoryphonenumber(),factory.getFactorypassword());
        return factory1;
    }
}
