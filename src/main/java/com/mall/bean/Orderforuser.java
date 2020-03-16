package com.mall.bean;


public class Orderforuser {

  private long orderid;
  private Integer ordernumber;
  private long userid;
  private long shopid;
  private String address;
  private String orderstate;
  private String ordertime;
  private String orderprice;
  private long ordergoodsnum;
  private String ordername;
  private String allgoodsid;
  private String orderpic;

  public Orderforuser(){}

  public Orderforuser(Integer ordernumber,long userid,long shopid,String address,String orderstate,String ordertime,String orderprice, Integer ordergoodsnum,String ordername,String allgoodsid,String orderpic){
    this.ordernumber=ordernumber;
    this.userid=userid;
    this.shopid=shopid;
    this.address=address;
    this.orderstate=orderstate;
    this.ordertime=ordertime;
    this.orderprice=orderprice;
    this.ordergoodsnum=ordergoodsnum;
    this.ordername=ordername;
    this.allgoodsid=allgoodsid;
    this.orderpic=orderpic;
  }

  @Override
  public String toString() {
    return "Orderforuser{" +
            "orderid=" + orderid +
            ", ordernumber='" + ordernumber + '\'' +
            ", userid='" + userid + '\'' +
            ", shopid='" + shopid + '\'' +
            ", address='" + address + '\'' +
            ", orderstate='" + orderstate + '\'' +
            ", ordertime='" + ordertime + '\'' +
            ", orderprice='" + orderprice + '\'' +
            ", ordergoodsnum='" + ordergoodsnum + '\'' +
            ", ordername='" + ordername + '\'' +
            ", allgoodsid='" + allgoodsid + '\'' +
            ", orderpic='" + orderpic + '\'' +
            '}';
  }


  public long getOrderid() {
    return orderid;
  }

  public void setOrderid(long orderid) {
    this.orderid = orderid;
  }


  public Integer getOrdernumber() {
    return ordernumber;
  }

  public void setOrdernumber(Integer ordernumber) {
    this.ordernumber = ordernumber;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
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


  public long getOrdergoodsnum() {
    return ordergoodsnum;
  }

  public void setOrdergoodsnum(long ordergoodsnum) {
    this.ordergoodsnum = ordergoodsnum;
  }

  public String getAllgoodsid() {
    return allgoodsid;
  }

  public void setAllgoodsid(String allgoodsid) {
    this.allgoodsid = allgoodsid;
  }

  public String getOrdername() {
    return ordername;
  }

  public void setOrdername(String ordername) {
    this.ordername = ordername;
  }

  public String getOrderpic() {
    return orderpic;
  }

  public void setOrderpic(String orderpic) {
    this.orderpic = orderpic;
  }
}
