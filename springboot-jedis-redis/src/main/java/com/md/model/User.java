package com.md.model;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import com.fasterxml.jackson.annotation.JsonView;
import java.lang.annotation.Target;
import lombok.Data;

/**
 * @Author xiaoqiang
 * @Date 2021/9/2 0002 13:49
 * @Version 1.0
 */
@Data
@ExcelTarget("20")
public class User {

  @Excel(name="id",width = 20)
  private Long id;
  @Excel(name="姓名",width = 20)
  private String userName;
  @JsonView(value = ViewPassword.class)
  private String password;
  private Integer loginType;
  @Excel(name="性别",width = 10)
  private Integer gender;
  @Excel(name="地址",width = 50)
  private String address;
  @Excel(name="电话号码",width = 30)
  private String phoneNumber;


  private class ViewPassword {

  }
}
