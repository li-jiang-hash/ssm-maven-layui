package com.aaa.ssm.pojo;


public class Menu {

  private long id;
  private String name;
  private String icon;
  private String href;
  private String perms;
  private String spread;
  private long parentId;
  private long sorting;


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


  public String getIcon() {
    return icon;
  }

  public void setIcon(String icon) {
    this.icon = icon;
  }


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }


  public String getPerms() {
    return perms;
  }

  public void setPerms(String perms) {
    this.perms = perms;
  }


  public String getSpread() {
    return spread;
  }

  public void setSpread(String spread) {
    this.spread = spread;
  }


  public long getParentId() {
    return parentId;
  }

  public void setParentId(long parentId) {
    this.parentId = parentId;
  }


  public long getSorting() {
    return sorting;
  }

  public void setSorting(long sorting) {
    this.sorting = sorting;
  }

}
