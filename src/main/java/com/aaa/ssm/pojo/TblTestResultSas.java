package com.aaa.ssm.pojo;


public class TblTestResultSas {

  private long id;
  private long testerId;
  private long questionId;
  private String answer;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public long getTesterId() {
    return testerId;
  }

  public void setTesterId(long testerId) {
    this.testerId = testerId;
  }


  public long getQuestionId() {
    return questionId;
  }

  public void setQuestionId(long questionId) {
    this.questionId = questionId;
  }


  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

}
