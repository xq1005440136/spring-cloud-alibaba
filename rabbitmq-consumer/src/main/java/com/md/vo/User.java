package com.md.vo;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * @Author xiaoqiang
 * @Date 2021/9/8 0008 15:45
 * @Version 1.0
 */
public class User {
  private String username;
  @JsonView(PasswordView.class)
  private String password;
  private String email;
  private Integer age;
  private String address;
  private String phone;
  private Integer loginType;

  private Integer pageNum;
  private Integer pageSize;

  public static class PasswordView{

  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Integer getLoginType() {
    return loginType;
  }

  public void setLoginType(Integer loginType) {
    this.loginType = loginType;
  }
}
