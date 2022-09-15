package com.aaa.ssm.pojo;


public class TblQuestionFpa {

  private long id;
  private String question;
  private String optionA;
  private String optionB;
  private String optionC;
  private String optionD;
  private long type;
  private long status;
  private java.sql.Timestamp createTime;
  private String createBy;
  private java.sql.Timestamp updateTime;
  private String updateBy;
  private long flag;

  @Override
  public String toString() {
    return "TblQuestionFpa{" +
            "id=" + id +
            ", question='" + question + '\'' +
            ", optionA='" + optionA + '\'' +
            ", optionB='" + optionB + '\'' +
            ", optionC='" + optionC + '\'' +
            ", optionD='" + optionD + '\'' +
            ", type=" + type +
            ", status=" + status +
            ", createTime=" + createTime +
            ", createBy='" + createBy + '\'' +
            ", updateTime=" + updateTime +
            ", updateBy='" + updateBy + '\'' +
            ", flag=" + flag +
            '}';
  }

  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }


  public String getOptionA() {
    return optionA;
  }

  public void setOptionA(String optionA) {
    this.optionA = optionA;
  }


  public String getOptionB() {
    return optionB;
  }

  public void setOptionB(String optionB) {
    this.optionB = optionB;
  }


  public String getOptionC() {
    return optionC;
  }

  public void setOptionC(String optionC) {
    this.optionC = optionC;
  }


  public String getOptionD() {
    return optionD;
  }

  public void setOptionD(String optionD) {
    this.optionD = optionD;
  }


  public long getType() {
    return type;
  }

  public void setType(long type) {
    this.type = type;
  }


  public long getStatus() {
    return status;
  }

  public void setStatus(long status) {
    this.status = status;
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


  public long getFlag() {
    return flag;
  }

  public void setFlag(long flag) {
    this.flag = flag;
  }

}
