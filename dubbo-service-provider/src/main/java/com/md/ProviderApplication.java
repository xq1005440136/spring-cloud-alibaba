package com.md;

import com.md.dubbo.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author xiaoqiang
 * @Date 2021/9/3 0003 9:56
 * @Version 1.0
 */
@SpringBootApplication
public class ProviderApplication {

  public static void main(String[] args) {
    ConfigurableApplicationContext run = SpringApplication.run(ProviderApplication.class, args);
//    UserService bean = run.getBean(UserService.class);
//    System.out.println("bean dkkklll======================"+bean );
  }

}
