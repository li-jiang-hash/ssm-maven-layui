package com.aaa.ssm.pojo;


public class AdminLog {

  private long id;
  private String adminUsername;
  private String loginIp;
  private java.sql.Timestamp loginTime;
  private java.sql.Timestamp logoutTime;
  private long isSafeExit;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getAdminUsername() {
    return adminUsername;
  }

  public void setAdminUsername(String adminUsername) {
    this.adminUsername = adminUsername;
  }


  public String getLoginIp() {
    return loginIp;
  }

  public void setLoginIp(String loginIp) {
    this.loginIp = loginIp;
  }


  public java.sql.Timestamp getLoginTime() {
    return loginTime;
  }

  public void setLoginTime(java.sql.Timestamp loginTime) {
    this.loginTime = loginTime;
  }


  public java.sql.Timestamp getLogoutTime() {
    return logoutTime;
  }

  public void setLogoutTime(java.sql.Timestamp logoutTime) {
    this.logoutTime = logoutTime;
  }


  public long getIsSafeExit() {
    return isSafeExit;
  }

  public void setIsSafeExit(long isSafeExit) {
    this.isSafeExit = isSafeExit;
  }

}
