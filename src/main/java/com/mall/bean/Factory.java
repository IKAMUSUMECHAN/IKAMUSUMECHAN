package com.mall.bean;


public class Factory {

  private long id;
  private String name;
  private String detail;
  private String factoryadmin;
  private String factorypassword;
  private String factoryphonenumber;

  public Factory(){}
  public Factory(String name,String detail,String factoryadmin,String factorypassword,String factoryphonenumber){
    this.name=name;
    this.detail=detail;
    this.factoryadmin=factoryadmin;
    this.factorypassword=factorypassword;
    this.factoryphonenumber=factoryphonenumber;
  }
  @Override
  public String toString() {
    return "Shop{" +
            "id=" + id +
            ", detail='" + detail + '\'' +
            ", factoryadmin='" + factoryadmin + '\'' +
            ", factorypassword='" + factorypassword + '\'' +
            ", factoryphonenumber='" + factoryphonenumber + '\'' +
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


  public String getFactoryadmin() {
    return factoryadmin;
  }

  public void setFactoryadmin(String factoryadmin) {
    this.factoryadmin = factoryadmin;
  }


  public String getFactorypassword() {
    return factorypassword;
  }

  public void setFactorypassword(String factorypassword) {
    this.factorypassword = factorypassword;
  }


  public String getFactoryphonenumber() {
    return factoryphonenumber;
  }

  public void setFactoryphonenumber(String factoryphonenumber) {
    this.factoryphonenumber = factoryphonenumber;
  }

}
