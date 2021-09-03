package com.md.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.md.UserAPi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xiaoqiang
 * @Date 2021/9/3 0003 16:20
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

  @Reference
  private UserAPi userAPi;

  @RequestMapping(value = "/get")
  public String get(){
    String s = userAPi.get();
    return s ;
  }

}
