package com.mall.service.impl;

import com.google.gson.Gson;
import com.mall.bean.Bigclass;
import com.mall.bean.Goods;
import com.mall.dao.BigclassDao;
import com.mall.dao.GoodsDao;
import com.mall.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private GoodsDao goodsDao;
    @Autowired
    private BigclassDao bigclassDao;

    @Override
    public String GetGoodsIdByShopId(Long sid) {
        //String goods = null;
        //goods = (Goods) goodsDao.GetGoodsIdByShopId(sid);
        //Goods gs= (Goods) goodsDao.GetGoodsIdByShopId(sid);

        //System.out.println(gs);
        //goods = JSONObject.toJSONString(String.valueOf(gs));
        //goods = JSONArray.toJSONString(gs);
        //return goods;
       // return goodsDao.GetGoodsIdByShopId(sid);
        List<Goods> gs= goodsDao.GetGoodsIdByShopId(sid);
        System.out.println(gs);
        //String str = gs.get(1)+"";
        Gson gson = new Gson();
        //System.out.println(jy);
        //.replace("[","").replace("]","")
        return  gson.toJson(gs);
    }

    //搜索物品
    @Override
    public List<Goods> SearchGoodsByGoodsName(String name) {
        List<Goods> goods1=null;
        goods1=goodsDao.SearchGoodsByGoodsName(name);
        return goods1;
    }

    @Override
    public List<Goods> getgoodsbycateid(Integer gCateId) {
        List goods=null;
        goods=goodsDao.getgoodsbycateid(gCateId);
        return goods;
    }

    @Override
    public List<Goods> getgoodsbybigclassid(Long bigclassid) {
        List goods=null;
        goods=goodsDao.getgoodsbybigclassid(bigclassid);
        return goods;
    }

    @Override
    public List<Goods> getgoodsbysid(Long sid) {
        List goods=null;
        goods=goodsDao.getgoodsbysid(sid);
        return goods;
    }

    @Override
    public void save(Object obj) {
        goodsDao.save(obj);
    }

    //根据商品id删除商品
    @Override
    public void removeById(Long id) {
        String a=null;
        goodsDao.removeById(id);
        //先判断缓存中是否存在此键 key,若存在则删除此键
        Boolean key_exist = redisTemplate.hasKey("goods-"+id);
        if (key_exist) {
            redisTemplate.delete("goods-"+id);
        }

        Goods goods = null;
        goods = (Goods) goodsDao.getById(id);
        if (goods == null) {
            a="success";
            if (goods != null) {
                a="false";
            }
        }

    }

    @Override
    public void update(Object obj) {
        //先修改数据库中的值
        goodsDao.update(obj);
        //查询缓存中是否有此数据值
        ValueOperations<String, Goods> valueOperations = redisTemplate.opsForValue();
        Goods goods = (Goods) obj;
        Goods shop1 = valueOperations.get("goods-"+ goods.getGId());
        //若存在此数据则重新设置缓存值
        if(shop1!=null){
            valueOperations.set("shop-"+goods.getGId(),goods);
        }
    }
    //获取货物
    @Override
    public Object getById(Long id) {
        Goods goods = null;
        goods = (Goods) goodsDao.getById(id);
        System.out.println(goods);
        return goods;
    }

    @Override
    public List<Object> listAll() {
        List<Object> bigclassList = new ArrayList<>();
        //从数据库中获取数据
        bigclassList = bigclassDao.listAll();
        if (bigclassList != null && bigclassList.size() != 0 ) {
            Iterator iter = bigclassList.iterator();
            while (iter.hasNext()) {
                Bigclass bigclass = (Bigclass) iter.next();
                redisTemplate.opsForValue().set("bigclass-"+bigclass.getBigclassid(),bigclass);
            }
        }
        return bigclassList;
    }

    @Override
    public Long count() {
        return null;
    }
}
