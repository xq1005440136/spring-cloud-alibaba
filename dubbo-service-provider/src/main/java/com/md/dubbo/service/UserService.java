package com.md.dubbo.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.md.UserAPi;
import org.apache.dubbo.config.annotation.DubboService;


/**
 * @Author xiaoqiang
 * @Date 2021/9/3 0003 10:11
 * @Version 1.0
 */
@Service(version = "1.0.0")
@DubboService
public class UserService implements UserAPi {


  @Override
  public String get() {
    return "hello";
  }
}
