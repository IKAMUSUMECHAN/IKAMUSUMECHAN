package com.mall.bean;


public class Orderforshop {

  private long orderid;
  private Integer ordernumber;
  private long firmid;
  private long shopid;
  private String address;
  private String orderstate;
  private String ordertime;
  private String orderprice;
  private Integer ordergoodsnum;

  public Orderforshop(){}

  public Orderforshop(Integer ordernumber,long firmid,long shopid,String address,String orderstate,String ordertime,String orderprice, Integer ordergoodsnum){
    this.ordernumber=ordernumber;
    this.firmid=firmid;
    this.shopid=shopid;
    this.address=address;
    this.orderstate=orderstate;
    this.ordertime=ordertime;
    this.orderprice=orderprice;
    this.ordergoodsnum=ordergoodsnum;
  }

  @Override
  public String toString() {
    return "Orderforshop{" +
            "orderid=" + orderid +
            ", ordernumber='" + ordernumber + '\'' +
            ", firmid='" + firmid + '\'' +
            ", shopid='" + shopid + '\'' +
            ", address='" + address + '\'' +
            ", orderstate='" + orderstate + '\'' +
            ", ordertime='" + ordertime + '\'' +
            ", orderprice='" + orderprice + '\'' +
            ", ordergoodsnum='" + ordergoodsnum + '\'' +
            '}';
  }


  public long getOrderid() {
    return orderid;
  }

  public void setOrderid(long orderid) { this.orderid = orderid; }


  public Integer getOrdernumber() {
    return ordernumber;
  }

  public void setOrdernumber(Integer ordernumber) {
    this.ordernumber = ordernumber;
  }

  public long getfirmid() {
    return firmid;
  }

  public void setfirmid(long firmid) {
    this.firmid = firmid;
  }

  public long getShopid() {
    return shopid;
  }

  public void setShopid(long shopid) {
    this.shopid = shopid;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getOrderstate() {
    return orderstate;
  }

  public void setOrderstate(String orderstate) {
    this.orderstate = orderstate;
  }


  public String getOrdertime() {
    return ordertime;
  }

  public void setOrdertime(String ordertime) {
    this.ordertime = ordertime;
  }


  public String getOrderprice() {
    return orderprice;
  }

  public void setOrderprice(String orderprice) {
    this.orderprice = orderprice;
  }


  public Integer getOrdergoodsnum() {
    return ordergoodsnum;
  }

  public void setOrdergoodsnum(Integer ordergoodsnum) {
    this.ordergoodsnum = ordergoodsnum;
  }

}
