package com.mall.bean;


public class Liuyan {

  private long liuyanid;
  private long userid;
  private String liuyantext;
  private String nickName;
  private String headimg;
  private long gid;

  public Liuyan(){}
  public Liuyan(long userid,String liuyantext,String nickName,String headimg,long gid){
    this.userid=userid;
    this.liuyantext=liuyantext;
    this.nickName=nickName;
    this.headimg=headimg;
    this.gid=gid;
  }


  @Override
  public String toString() {
    return "Liuyan{" +
            "liuyanid=" + liuyanid +
            ", userid='" + userid + '\'' +
            ", liuyantext='" + liuyantext + '\'' +
            ", nickName='" + nickName + '\'' +
            ", headimg='" + headimg + '\'' +
            ", gid='" + gid + '\'' +
            '}';
  }


  public long getLiuyanid() {
    return liuyanid;
  }

  public void setLiuyanid(long liuyanid) {
    this.liuyanid = liuyanid;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public String getLiuyantext() {
    return liuyantext;
  }

  public void setLiuyantext(String liuyantext) {
    this.liuyantext = liuyantext;
  }


  public String getNickName() {
    return nickName;
  }

  public void setNickName(String nickName) {
    this.nickName = nickName;
  }


  public String getHeadimg() {
    return headimg;
  }

  public void setHeadimg(String headimg) {
    this.headimg = headimg;
  }


  public long getGid() {
    return gid;
  }

  public void setGid(long gid) {
    this.gid = gid;
  }

}
