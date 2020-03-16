package com.mall.bean;


public class Huilv {

  private long id;
  private String name;
  private String huilv;

  public Huilv(){}
  public Huilv(String name,String huilv){
    this.name=name;
    this.huilv=huilv;
  }
  @Override
  public String toString() {
    return "Huilv{" +
            "name=" + name +
            ", huilv='" + huilv + '\'' +
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


  public String getHuilv() {
    return huilv;
  }

  public void setHuilv(String huilv) {
    this.huilv = huilv;
  }

}
