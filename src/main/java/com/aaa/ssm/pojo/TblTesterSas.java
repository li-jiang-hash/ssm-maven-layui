package com.aaa.ssm.pojo;


public class TblTesterSas {

  private long id;
  private String name;
  private String phone;
  private java.sql.Timestamp createTime;
  private long testPlanId;


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


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public long getTestPlanId() {
    return testPlanId;
  }

  public void setTestPlanId(long testPlanId) {
    this.testPlanId = testPlanId;
  }

}
