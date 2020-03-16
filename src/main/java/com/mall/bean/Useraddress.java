package com.mall.bean;


public class Useraddress {

  private long addressid;
  private long userid;
  private String address;
  private long userphonenum;
  private String addressee;

  public Useraddress(){}

  public Useraddress(long userid,String address,long userphonenum,String addressee){
    this.userid=userid;
    this.address=address;
    this.userphonenum=userphonenum;
    this.addressee=addressee;
  }

  @Override
  public String toString() {
    return "Useraddress{" +
            "addressid=" + addressid +
            ", userid='" + userid + '\'' +
            ", address='" + address + '\'' +
            ", userphonenum='" + userphonenum + '\'' +
            ", addressee=" + addressee +
            '}';
  }

  public long getAddressid() {
    return addressid;
  }

  public void setAddressid(long addressid) {
    this.addressid = addressid;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public long getUserphonenum() {
    return userphonenum;
  }

  public void setUserphonenum(long userphonenum) {
    this.userphonenum = userphonenum;
  }


  public String getAddressee() {
    return addressee;
  }

  public void setAddressee(String addressee) {
    this.addressee = addressee;
  }

}
