package com.mall.bean;


public class Keep {

  private long keepid;
  private long goodsid;
  private long userid;
  private String nowprice;
  private String gname;
  private String gdetail;
  private String gpic;

  public Keep(){}

  public Keep(long goodsid,long userid,String nowprice,String gname,String gdetail,String gpic){
    this.goodsid=goodsid;
    this.userid=userid;
    this.nowprice=nowprice;
    this.gname=gname;
    this.gdetail=gdetail;
    this.gpic=gpic;
  }
  @Override
  public String toString() {
    return "Keep{" +
            "keepid=" + keepid +
            ", goodsid='" + goodsid + '\'' +
            ", userid='" + userid + '\'' +
            ", nowprice='" + nowprice + '\'' +
            ", gname='" + gname + '\'' +
            ", gdetail='" + gdetail + '\'' +
            ", gpic='" + gpic + '\'' +
            '}';
  }



  public long getKeepid() {
    return keepid;
  }

  public void setKeepid(long keepid) {
    this.keepid = keepid;
  }


  public long getGoodsid() {
    return goodsid;
  }

  public void setGoodsid(long goodsid) {
    this.goodsid = goodsid;
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
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
