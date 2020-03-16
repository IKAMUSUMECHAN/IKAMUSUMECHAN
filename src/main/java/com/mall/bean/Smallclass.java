package com.mall.bean;


public class Smallclass {

  private long smallclassid;
  private long interfaceid;
  private String smallclassname;
  private String smallclasspir;
  private String smallclassdetail;

  public Smallclass(){}
  public Smallclass(long interfaceid,String smallclassname,String smallclasspir,String smallclassdetail){
    this.interfaceid=interfaceid;
    this.smallclassname=smallclassname;
    this.smallclasspir=smallclasspir;
    this.smallclassdetail=smallclassdetail;
  }

  @Override
  public String toString() {
    return "Smallclass{" +
            "smallclassid=" + smallclassid +
            ", interfaceid='" + interfaceid + '\'' +
            ", smallclassname='" + smallclassname + '\'' +
            ", smallclasspir='" + smallclasspir + '\'' +
            ", smallclassdetail='" + smallclassdetail + '\'' +
            '}';
  }


  public long getSmallclassid() {
    return smallclassid;
  }

  public void setSmallclassid(long smallclassid) {
    this.smallclassid = smallclassid;
  }


  public long getInterfaceid() {
    return interfaceid;
  }

  public void setInterfaceid(long interfaceid) {
    this.interfaceid = interfaceid;
  }


  public String getSmallclassname() {
    return smallclassname;
  }

  public void setSmallclassname(String smallclassname) {
    this.smallclassname = smallclassname;
  }


  public String getSmallclasspir() {
    return smallclasspir;
  }

  public void setSmallclasspir(String smallclasspir) {
    this.smallclasspir = smallclasspir;
  }


  public String getSmallclassdetail() {
    return smallclassdetail;
  }

  public void setSmallclassdetail(String smallclassdetail) {
    this.smallclassdetail = smallclassdetail;
  }

}
