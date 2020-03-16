package com.mall.bean;


public class User {

  private long userid;
  private String username;
  private long userphonenum;
  private String userpassword;
  private String usernickname;
  private String userwxnum;
  private String userportrait;
  private String userstate;
  private String token;

  public User(){}

  public User(String username,long userphonenum,String userpassword,String usernickname,String userwxnum,String userportrait,String userstate,String token){
    this.username=username;
    this.userphonenum=userphonenum;
    this.userpassword=userpassword;
    this.usernickname=usernickname;
    this.userwxnum=userwxnum;
    this.userportrait=userportrait;
    this.userstate=userstate;
    this.token=token;
  }
  @Override
  public String toString() {
    return "User{" +
            "userid=" + userid +
            ", userphonenum='" + userphonenum + '\'' +
            ", userpassword='" + userpassword + '\'' +
            ", usernickname='" + usernickname + '\'' +
            ", userwxnum='" + userwxnum + '\'' +
            ", userportrait='" + userportrait + '\'' +
            ", userstate='" + userstate + '\'' +
            ", token='" + token + '\'' +
            '}';
  }


  public long getUserid() {
    return userid;
  }

  public void setUserid(long userid) {
    this.userid = userid;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public long getUserphonenum() {
    return userphonenum;
  }

  public void setUserphonenum(long userphonenum) {
    this.userphonenum = userphonenum;
  }


  public String getUserpassword() {
    return userpassword;
  }

  public void setUserpassword(String userpassword) {
    this.userpassword = userpassword;
  }


  public String getUsernickname() {
    return usernickname;
  }

  public void setUsernickname(String usernickname) {
    this.usernickname = usernickname;
  }


  public String getUserwxnum() {
    return userwxnum;
  }

  public void setUserwxnum(String userwxnum) {
    this.userwxnum = userwxnum;
  }


  public String getUserportrait() {
    return userportrait;
  }

  public void setUserportrait(String userportrait) {
    this.userportrait = userportrait;
  }


  public String getUserstate() {
    return userstate;
  }

  public void setUserstate(String userstate) {
    this.userstate = userstate;
  }


  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

}
