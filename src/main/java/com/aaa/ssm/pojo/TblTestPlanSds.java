package com.aaa.ssm.pojo;


public class TblTestPlanSds {

  private long id;
  private String testName;
  private long testCode;
  private java.sql.Timestamp testBegin;
  private java.sql.Timestamp testEnd;
  private java.sql.Timestamp createTime;
  private String createBy;
  private java.sql.Timestamp updateTime;
  private String updateBy;
  private String remark;
  private String type;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getTestName() {
    return testName;
  }

  public void setTestName(String testName) {
    this.testName = testName;
  }


  public long getTestCode() {
    return testCode;
  }

  public void setTestCode(long testCode) {
    this.testCode = testCode;
  }


  public java.sql.Timestamp getTestBegin() {
    return testBegin;
  }

  public void setTestBegin(java.sql.Timestamp testBegin) {
    this.testBegin = testBegin;
  }


  public java.sql.Timestamp getTestEnd() {
    return testEnd;
  }

  public void setTestEnd(java.sql.Timestamp testEnd) {
    this.testEnd = testEnd;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }


  public java.sql.Timestamp getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Timestamp updateTime) {
    this.updateTime = updateTime;
  }


  public String getUpdateBy() {
    return updateBy;
  }

  public void setUpdateBy(String updateBy) {
    this.updateBy = updateBy;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

}
