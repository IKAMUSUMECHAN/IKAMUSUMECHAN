package com.mall.bean;


public class Cart {

  private long carid;
  private long userid;
  private long gid;
  private String nowprice;
  private String gname;
  private String gdetail;
  private String gpic;

  public Cart(){}

  public Cart(long userid,long gid,String nowprice,String gname,String gdetail,String gpic){
    this.userid=userid;
    this.gid=gid;
    this.nowprice=nowprice;
    this.gname=gname;
    this.gdetail=gdetail;
    this.gpic=gpic;
  }

  @Override
  public String toString() {
    return "Cart{" +
            "carid=" + carid +
            ", userid='" + userid + '\'' +
            ", gid='" + gid + '\'' +
            ", nowprice='" + nowprice + '\'' +
            ", gname='" + gname + '\'' +
            ", gdetail='" + gdetail + '\'' +
            ", gpic='" + gpic + '\'' +
            '}';
  }

  public long getCarid() {
    return carid;
  }

  public void setCarid(long carid) {
    this.carid = carid;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public long getGid() {
    return gid;
  }

  public void setGid(long gid) {
    this.gid = gid;
  }


  public String getNowprice() {
    return nowprice;
  }

  public void setNowprice(String nowprice) {
    this.nowprice = nowprice;
  }


  public String getGname() {
    return gname;
  }

  public void setGname(String gname) {
    this.gname = gname;
  }


  public String getGdetail() {
    return gdetail;
  }

  public void setGdetail(String gdetail) {
    this.gdetail = gdetail;
  }


  public String getGpic() {
    return gpic;
  }

  public void setGpic(String gpic) {
    this.gpic = gpic;
  }

}
