package com.md;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author xiaoqiang
 * @Date 2021/9/3 0003 9:55
 * @Version 1.0
 */
@SpringBootApplication(exclude = SecurityAutoConfiguration.class,scanBasePackages = "com.md")
public class ConsumerApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext run = SpringApplication.run(ConsumerApplication.class, args);
//    UserAPi bean = run.getBean(UserAPi.class);
//    System.out.println("bean dkkklll======================"+bean );
  }
}
