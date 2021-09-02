package com.md;

import com.md.conf.EnableConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author xiaoqiang
 * @Date 2021/8/30 0030 10:54
 * @Version 1.0
 */
@SpringBootApplication
@EnableFeignClients
@Slf4j
public class JedisApplication {

  public static void main(String[] args) {

    ConfigurableApplicationContext run = SpringApplication.run(JedisApplication.class, args);

  }
}
