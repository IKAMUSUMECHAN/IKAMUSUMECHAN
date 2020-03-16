package com.mall.bean;


public class Bigclass {

  private long bigclassid;
  private String bigclassname;

  public Bigclass(){}

  public Bigclass(String bigclassname){
    this.bigclassname=bigclassname;
  }

  @Override
  public String toString() {
    return "Bigclass{" +
            "bigclassid=" + bigclassid +
            ", bigclassname='" + bigclassname + '\'' +
            '}';
  }

  public long getBigclassid() {
    return bigclassid;
  }

  public void setBigclassid(long bigclassid) {
    this.bigclassid = bigclassid;
  }


  public String getBigclassname() {
    return bigclassname;
  }

  public void setBigclassname(String bigclassname) {
    this.bigclassname = bigclassname;
  }

}
