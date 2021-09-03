package com.md;

import com.md.conf.EnableConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author xiaoqiang
 * @Date 2021/8/30 0030 10:54
 * @Version 1.0
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class GateWayApplication {

  public static void main(String[] args) {

    ConfigurableApplicationContext run = SpringApplication.run(GateWayApplication.class, args);
    String[] beans = run.getBeanNamesForType(EnableConfig.class);
    for (String bean : beans) {
      log.info("bean 的名称是： =====" + bean);
    }
  }
}
