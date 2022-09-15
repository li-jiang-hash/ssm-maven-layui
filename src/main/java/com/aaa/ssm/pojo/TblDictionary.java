package com.aaa.ssm.pojo;


public class TblDictionary {

  private long dictionaryId;
  private long typeId;
  private String dictionaryName;
  private String createBy;
  private java.sql.Date createTime;
  private String updateBy;
  private java.sql.Date updateTime;
  private String remark;


  public long getDictionaryId() {
    return dictionaryId;
  }

  public void setDictionaryId(long dictionaryId) {
    this.dictionaryId = dictionaryId;
  }


  public long getTypeId() {
    return typeId;
  }

  public void setTypeId(long typeId) {
    this.typeId = typeId;
  }


  public String getDictionaryName() {
    return dictionaryName;
  }

  public void setDictionaryName(String dictionaryName) {
    this.dictionaryName = dictionaryName;
  }


  public String getCreateBy() {
    return createBy;
  }

  public void setCreateBy(String createBy) {
    this.createBy = createBy;
  }


  public java.sql.Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Date createTime) {
    this.createTime = createTime;
  }


  public String getUpdateBy() {
    return updateBy;
  }

  public void setUpdateBy(String updateBy) {
    this.updateBy = updateBy;
  }


  public java.sql.Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(java.sql.Date updateTime) {
    this.updateTime = updateTime;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

}
