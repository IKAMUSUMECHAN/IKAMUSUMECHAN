package com.mall.controller;

import com.mall.bean.Details;
import com.mall.bean.Huilv;
import com.mall.bean.Slider;
import com.mall.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/*首页内容Controller*/
@RestController
@RequestMapping("/index")
public class IndexController {
    @Autowired
    private SliderService sliderService;
    @Autowired
    private VenuesService venuesService;
    @Autowired
    private DetailsService detailsService;
    @Autowired
    private HuilvService huilvService;
    @Autowired
    private ShopService shopService;

    //返回轮播图信息
    @GetMapping("/sliderList")
    public List<Slider> listSliders () {
        List<Slider> sliders = sliderService.listSliders();
        return sliders;
    }

    @GetMapping("/huilvList")
    public List<Object> huilvList () {
        List<Object> huilv = huilvService.listAll();
        return huilv;
    }

    //修改轮播图数据
    @GetMapping("updateSliderById/Slider")
    public Slider updateSliderById (Slider slider){
        Slider slider1=null;
        sliderService.update(slider);
        slider1=sliderService.getById(slider.getSid());
        return slider1;
    }

    //返回分类表信息
    @GetMapping("veunesList")
    public List<Object> listVenues () {
        List<Object> venueses = venuesService.listAll();
        return venueses;
    }

    //返回详情表所有信息
    @GetMapping("detailstList")
    public List<Object> listDetails () {
        List<Object> detailses = detailsService.listAll();
        return detailses;
    }

    //删除详情表
    @GetMapping("removeDetailListById/did={did}")
    public void removeDetailListById (@PathVariable("did") Long did){ detailsService.removeById(did);}

    //根据分类表vid获取详情列表list
    @GetMapping("detailsListByvid/vid={vid}")
    public List<Details> listDetailsByVid (@PathVariable("vid") Long vid) {
        return detailsService.listByVid(vid);
    }

    //根据商品详情did获取对象信息
    @GetMapping("getDetailsById/did={did}")
    public Details getDetailsByDid (@PathVariable("did") Long did) {
        return (Details) detailsService.getById(did);
    }

    //测试
    @GetMapping("666")
    public int listVenues2 () {
        int n=6;
        return n;
    }

}
