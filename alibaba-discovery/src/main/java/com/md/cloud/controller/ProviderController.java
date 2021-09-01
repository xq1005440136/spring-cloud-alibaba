package com.md.cloud.controller;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.md.cloud.api.EchoConsumerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xiaoqiang
 * @Date 2021/8/30 0030 15:14
 * @Version 1.0
 */
@RestController
@RequestMapping(value = "/provide")
@RefreshScope
public class ProviderController {

  @Value("${user.sex}")
  private String appKey;


  @Autowired
  private EchoConsumerApi echoConsumerApi;
  @RequestMapping(value = "/getAlibaba")
  public String getAlibaba(){
    return echoConsumerApi.getAliababa();

  }
  @RequestMapping(value = "/provide/getConfig")
  public String getConfig(){
  return appKey;

  }








}
