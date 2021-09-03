package com.md.controller;

import com.md.api.EchoApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xiaoqiang
 * @Date 2021/8/30 0030 15:07
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "echo")
@RefreshScope
public class EchoController {

  @Autowired
  private EchoApi echoApi;

  @Value("${user.email}")
  private String email;


  @RequestMapping(value = "/getAlibaba")
  public String getAlibabba() {
    return echoApi.getAlibaba();
  }

  @RequestMapping(value = "getConfig")
  public String getConfig() {
    return echoApi.getConfig();
  }

  @RequestMapping(value = "getEmail")
  public String getEmail() {
    return email;
  }

}
