package com.mall.service.impl;

import com.mall.bean.Smallclass;
import com.mall.dao.SmallclassDao;
import com.mall.service.SmallclassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SmallclassServiceImpl implements SmallclassService {
    @Autowired
    private SmallclassDao smallclassDao;
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void save(Object obj) {
        //因添加数据时获取不到id，无法将此obj设置到缓存中，所以直接将数据保存在数据库中即可
        smallclassDao.save(obj);
    }

    //删除商铺
    @Override
    public void removeById(Long id) {
        String a=null;
        smallclassDao.removeById(id);
        //先判断缓存中是否存在此键 key,若存在则删除此键
        Boolean key_exist = redisTemplate.hasKey("smallclass-"+id);
        if (key_exist) {
            redisTemplate.delete("smallclass-"+id);
        }

        Smallclass smallclass = null;
        smallclass = (Smallclass) smallclassDao.getById(id);
        if (smallclass == null) {
            a="success";
            if (smallclass != null) {
                a="false";
            }
        }

    }



    @Override
    public void update(Object obj) {
        //先修改数据库中的值
        smallclassDao.update(obj);
        //查询缓存中是否有此数据值
        ValueOperations<String, Smallclass> valueOperations = redisTemplate.opsForValue();
        Smallclass smallclass = (Smallclass) obj;
        Smallclass smallclass1 = valueOperations.get("smallclass-"+ smallclass.getSmallclassid());
        //若存在此数据则重新设置缓存值
        if(smallclass1!=null){
            valueOperations.set("smallclass-"+smallclass.getSmallclassid(),smallclass);
        }
    }
    //获取店铺
    @Override
    public Object getById(Long iid) {
        Smallclass smallclass = null;
        smallclass = (Smallclass) smallclassDao.getById(iid);
        System.out.println(smallclass);
        return smallclass;
    }

    @Override
    public List<Object> listAll() {
        List<Object> smallclassList = new ArrayList<>();
        Long countAll = this.count();
        //从数据库中获取数据
        smallclassList = smallclassDao.listAll();

        return smallclassList;
    }


    @Override
    public Long count() {
        return smallclassDao.count();
    }


    @Override
    public List<Object> getsmallclassbygroup(Long iid) {
        List<Object> smallclasses =new ArrayList<>();
        smallclasses=smallclassDao.getsmallclassbygroup(iid);
        return smallclasses;
    }
}