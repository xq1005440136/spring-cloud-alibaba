package com.md.cloud.service;

import com.md.cloud.api.EchoConsumerApi;
import org.springframework.stereotype.Service;

/**
 * @Author xiaoqiang
 * @Date 2021/8/30 0030 15:16
 * @Version 1.0
 */
@Service
public class EchoConsumerService implements EchoConsumerApi {


  @Override
  public String getAliababa() {
    return "cloud alibab";
  }
}
