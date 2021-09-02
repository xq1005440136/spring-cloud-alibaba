package com.md.conf;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author xiaoqiang
 * @Date 2021/8/30 0030 13:43
 * @Version 1.0
 */
@Configuration
@ConditionalOnMissingBean(EnableConfig.class)
public class HttpConfig {

  @Bean
  @ConditionalOnMissingBean(name="restTemplate")
  @LoadBalanced
  public RestTemplate restTemplate(){

    return new RestTemplate();
  }

}
