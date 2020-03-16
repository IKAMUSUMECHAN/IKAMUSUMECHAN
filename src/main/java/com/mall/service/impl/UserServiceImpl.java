package com.mall.service.impl;

import com.mall.bean.User;
import com.mall.dao.UserDao;
import com.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void save(Object obj) {
        userDao.save(obj);
    }

    @Override
    public void removeById(Long id) {

    }

    @Override
    public void update(Object obj) {

    }

    @Override
    public Object getById(Long id) {
        return null;
    }

    @Override
    public List<Object> listAll() {
        return null;
    }

    @Override
    public Long count() {
        return null;
    }

    @Override
    public User userlogin(Long userphonenum,String userpassword) {
        User user=null;
        user=userDao.userlogin(userphonenum);
        if(Objects.equals(userpassword, user.getUserpassword()))
        {return user;}
        else return null;
    }

}
