package com.md.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author xiaoqiang
 * @Date 2021/8/30 0030 13:47
 * @Version 1.0
 */
@FeignClient("service-provider")
public interface EchoApi {


  @RequestMapping(value = "/provide/getAlibaba")
  public String getAlibaba();

  @RequestMapping(value = "/provide/getConfig")
  String getConfig();
}
