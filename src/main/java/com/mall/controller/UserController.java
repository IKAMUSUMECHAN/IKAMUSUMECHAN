package com.mall.controller;

import com.mall.bean.*;
import com.mall.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/user",produces = "application/json; charset=utf-8")

public class UserController {
    @Autowired
    private UseraddressService useraddressService;
    @Autowired
    private KeepService keepService;
    @Autowired
    private UserService userService;
    @Autowired
    private CartService cartService;
    @Autowired
    private LiuyanService liuyanService;

    //新增用户地址
    @GetMapping("adduseraddres/useraddress")
    public Useraddress addnewuseraddres(Useraddress useraddress){
        Useraddress useraddress1=null;
        useraddressService.save(useraddress);
        useraddress1= (Useraddress) useraddressService.getById(useraddress.getAddressid());
        return useraddress1;
    }
    //删除用户地址
    @GetMapping("removeUseraddressById/addressid={id}")
    public void removeUseraddressById (@PathVariable("id") Long id){ useraddressService.removeById(id);}

    //修改用户地址
    @GetMapping("updateUseraddressById/Useraddress")
    public Useraddress updateUseraddressById (Useraddress useraddress){
        Useraddress useraddress1=null;
        useraddressService.update(useraddress);
        useraddress1= (Useraddress) useraddressService.getById(useraddress.getAddressid());
        return useraddress1;
    }

    //获得用户地址
    @GetMapping("getuseraddressbyid/userid={userid}")
    public List<Useraddress> getuseraddressbyid(@PathVariable("userid")Long userid){
        return  useraddressService.getuseraddressbyid(userid);
    }

    //新增用户收藏
    @GetMapping("adduserkeep/keep")
    public Keep addnewkeep(Keep keep){
        Keep keep1=null;
        keepService.save(keep);
        keep1= (Keep) keepService.getById(keep.getGoodsid());
        return keep1;
    }
    //删除用户收藏
    @GetMapping("removeUserkeepById/keepid={id}")
    public void removeUserkeepById (@PathVariable("id") Long id){ keepService.removeById(id);}
    //查询用户全部收藏
    @GetMapping("getalluserkeep")
    public List<Object> listKeep () {
        List<Object> keep = keepService.listAll();
        return keep;
    }

    //登录用户
    @GetMapping("userlogin/User")
    public User shoplongin(User user){
        User user1=null;
        user1= userService.userlogin(user.getUserphonenum(),user.getUserpassword());
        return user1;
    }
    //新增用户
    @GetMapping("addnewuser/user")
    public User addnewshop(User user){
        User user1=null;
        userService.save(user);
        return user1;
    }

    @GetMapping("addcart/cart")
    public Cart addcart(Cart cart){
        cartService.save(cart);
        return null;
    }
    @GetMapping("deletecart/carid={carid}")
    public void deletecart(@PathVariable("carid")Long carid){
        cartService.removeById(carid);
    }

    @GetMapping("getcartbyuserid/userid={userid}")
    public List<Cart> getcartbyuserid(@PathVariable("userid")Long userid){
        List a=cartService.getcartbyuserid(userid);
        return a;
    }

    @GetMapping("addkeep/keep")
    public Keep addkeep(Keep keep){
        keepService.save(keep);
        return null;
    }
    @GetMapping("deletekeep/keepid={keepid}")
    public void deletekeep(@PathVariable("keepid")Long keepid){
        keepService.removeById(keepid);
    }

    @GetMapping("getkeepbyuserid/userid={userid}")
    public List<Keep> getkeepbyuserid(@PathVariable("userid")Long userid){
        List a=keepService.getkeepbyuserid(userid);
        return a;
    }

    @GetMapping("addliuyan/liuyan")
    public Liuyan addliuyan(Liuyan liuyan){
        liuyanService.save(liuyan);
        return null;
    }

    @GetMapping("getliuyanbyuserid/userid={userid}")
    public List<Liuyan> getliuyanbyuserid(@PathVariable("userid")Long userid){
        List a=liuyanService.getliuyanbyuserid(userid);
        return a;
    }

    @GetMapping("getliuyanbygid/gid={gid}")
    public List<Liuyan> getliuyanbygid(@PathVariable("gid")Long gid){
        List a=liuyanService.getliuyanbygid(gid);
        return a;
    }


}
