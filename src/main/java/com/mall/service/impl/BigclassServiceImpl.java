package com.mall.service.impl;

import com.mall.bean.Bigclass;
import com.mall.dao.BigclassDao;
import com.mall.service.BigclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BigclassServiceImpl implements BigclassService {
    @Autowired
    private BigclassDao bigclassDao;
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void save(Object obj) {
        bigclassDao.save(obj);
    }

    //删除商铺
    @Override
    public void removeById(Long id) {
        String a=null;
        bigclassDao.removeById(id);
        Boolean key_exist = redisTemplate.hasKey("bigclass-"+id);
        if (key_exist) {
            redisTemplate.delete("bigclass-"+id);
        }

        Bigclass bigclass = null;
        bigclass = (Bigclass) bigclassDao.getById(id);
        if (bigclass == null) {
            a="success";
            if (bigclass != null) {
                a="false";
            }
        }

    }



    @Override
    public void update(Object obj) {
        //先修改数据库中的值
        bigclassDao.update(obj);
        //查询缓存中是否有此数据值
        ValueOperations<String, Bigclass> valueOperations = redisTemplate.opsForValue();
        Bigclass bigclass = (Bigclass) obj;
        Bigclass bigclass1 = valueOperations.get("bigclass-"+ bigclass.getBigclassid());
        //若存在此数据则重新设置缓存值
        if(bigclass1!=null){
            valueOperations.set("bigclass-"+bigclass.getBigclassid(),bigclass);
        }
    }
    //获取bigclass
    @Override
    public Object getById(Long id) {
        Bigclass bigclass = null;
        bigclass = (Bigclass) bigclassDao.getById(id);
        System.out.println(bigclass);
        return bigclass;
    }

    @Override
    public List<Object> listAll() {
        List<Object> bigclassList = new ArrayList<>();
        List<Object> detailsList = new ArrayList<>();
        Long countAll = this.count();
        //从数据库中获取数据
        bigclassList = bigclassDao.listAll();

        return bigclassList;
    }


    @Override
    public Long count() {
        return bigclassDao.count();
    }


}