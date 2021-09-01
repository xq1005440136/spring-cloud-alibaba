package com.md.cloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;


/**
 * @Author xiaoqiang
 * @Date 2021/8/27 0027 9:25
 * @Version 1.0
 */
@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
@Slf4j
@EnableDiscoveryClient
public class NacosDiscoveryApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext run = SpringApplication
        .run(NacosDiscoveryApplication.class, args);
  }

}
