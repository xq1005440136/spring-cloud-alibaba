package com.md.model;

import org.springframework.stereotype.Component;

/**
 * @Author xiaoqiang
 * @Date 2021/8/30 0030 16:09
 * @Version 1.0
 */
@Component
public class UserInfo {

  private String userName;
  private String password;
  private Integer sex;

  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public Integer getSex() {
    return sex;
  }

  public void setSex(Integer sex) {
    this.sex = sex;
  }

  public void init() {
    System.out.println("初始化bean的方法执行了");
  }

  public void destroy() {
    System.out.println("摧毁bean的方法执行了");
  }

}
