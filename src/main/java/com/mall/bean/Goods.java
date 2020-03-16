package com.mall.bean;

import java.io.Serializable;

public class Goods implements Serializable {
  private Long gId;
  private Integer sId;
  private Integer fId;
  private String gName;
  private String gPicture;
  private String nowPrice;
  private String oldPrice;
  private String facturePrice;
  private Integer salesNum;
  private String gCateName;
  private Integer gCateId;
  private Integer gPingjia;
  private String goodsDetail;

  public Goods(){
  }

  public Goods(Integer sId,Integer fId,String gName,String gPicture,String nowPrice,String oldPrice,String facturePrice,Integer salesNum,String gCateName,Integer gCateId,Integer gPingjia,String goodsDetail) {
    this.sId=sId;
    this.fId=fId;
    this.gName=gName;
    this.gPicture=gPicture;
    this.nowPrice=nowPrice;
    this.oldPrice=oldPrice;
    this.facturePrice=facturePrice;
    this.salesNum=salesNum;
    this.gCateName=gCateName;
    this.gCateId=gCateId;
    this.gPingjia=gPingjia;
    this.goodsDetail=goodsDetail;
  }

  @Override
  public String toString() {
    return "Goods{" +
            "gId=" + gId +
            ", sId='" + sId + '\'' +
            ", fId='" + fId + '\'' +
            ", gName='" + gName + '\'' +
            ", gPicture='" + gPicture + '\'' +
            ", nowPrice='" + nowPrice + '\'' +
            ", oldPrice='" + oldPrice + '\'' +
            ", facturePrice='" + facturePrice + '\'' +
            ", salesNum='" + salesNum + '\'' +
            ", gCateName='" + gCateName + '\'' +
            ", gCateId='" + gCateId + '\'' +
            ", gPingjia='" + gPingjia + '\'' +
            ", goodsDetail='" + goodsDetail + '\'' +
            '}';
  }



  public Long getGId() {
    return gId;
  }

  public void setGId(long gId) {
    this.gId = gId;
  }


  public Integer getSId() {
    return sId;
  }

  public void setSId(Integer sId) {
    this.sId = sId;
  }


  public Integer getFId() { return fId; }

  public void setFId(Integer fId) {
    this.fId = fId;
  }


  public String getGName() {
    return gName;
  }

  public void setGName(String gName) {
    this.gName = gName;
  }


  public String getGPicture() {
    return gPicture;
  }

  public void setGPicture(String gPicture) {
    this.gPicture = gPicture;
  }


  public String getNowPrice() {
    return nowPrice;
  }

  public void setNowPrice(String nowPrice) {
    this.nowPrice = nowPrice;
  }


  public String getOldPrice() {
    return oldPrice;
  }

  public void setOldPrice(String oldPirce) {
    this.oldPrice = oldPirce;
  }


  public String getFacturePrice() {
    return facturePrice;
  }

  public void setFacturePrice(String facturePrice) {
    this.facturePrice = facturePrice;
  }


  public Integer getSalesNum() {
    return salesNum;
  }

  public void setSalesNum(Integer salesNum) {
    this.salesNum = salesNum;
  }


  public String getGCateName() {
    return gCateName;
  }

  public void setGCateName(String gCateName) {
    this.gCateName = gCateName;
  }


  public Integer getGCateId() {
    return gCateId;
  }

  public void setGCateId(Integer gCateId) {
    this.gCateId = gCateId;
  }


  public Integer getGPingjia() {
    return gPingjia;
  }

  public void setGPingjia(Integer gPingjia) {
    this.gPingjia = gPingjia;
  }


  public String getGoodsDetail() {
    return goodsDetail;
  }

  public void setGoodsDetail(String goodsDetail) {
    this.goodsDetail = goodsDetail;
  }


}
