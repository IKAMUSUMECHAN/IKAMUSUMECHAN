package com.mall.bean;

import java.io.Serializable;

public class Shop implements Serializable{

  private long id;
  private String name;
  private String detail;
  private String shopadmin;
  private long shoppassword;
  private String shopphonenumber;
  private String shopzhuangtai;
  private long shopxing;

  public Shop() {
  }

  public Shop(String name,String detail,String shopadmin,long shoppassword,String shopphonenumber,String shopzhuangtai,long shopxing) {
    this.name=name;
    this.detail=detail;
    this.shopadmin=shopadmin;
    this.shoppassword=shoppassword;
    this.shopphonenumber=shopphonenumber;
    this.shopzhuangtai=shopzhuangtai;
    this.shopxing=shopxing;
  }
  @Override
  public String toString() {
    return "Shop{" +
            "id=" + id +
            ", detail='" + detail + '\'' +
            ", shopadmin='" + shopadmin + '\'' +
            ", shoppassword='" + shoppassword + '\'' +
            ", shopphonenumber='" + shopphonenumber + '\'' +
            ", shopzhuangtai='" + shopzhuangtai + '\'' +
            ", shopxing='" + shopxing + '\'' +
            '}';
  }


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }


  public String getShopadmin() {
    return shopadmin;
  }

  public void setShopadmin(String shopadmin) {
    this.shopadmin = shopadmin;
  }


  public long getShoppassword() {
    return shoppassword;
  }

  public void setShoppassword(long shoppassword) {
    this.shoppassword = shoppassword;
  }


  public String getShopphonenumber() {
    return shopphonenumber;
  }

  public void setShopphonenumber(String shopphonenumber) {
    this.shopphonenumber = shopphonenumber;
  }


  public String getShopzhuangtai() {
    return shopzhuangtai;
  }

  public void setShopzhuangtai(String shopzhuangtai) {
    this.shopzhuangtai = shopzhuangtai;
  }


  public long getShopxing() {
    return shopxing;
  }

  public void setShopxing(long shopxing) {
    this.shopxing = shopxing;
  }

}
