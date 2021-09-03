package com.md.conf;

import com.md.model.UserInfo;
import com.md.utils.SpringUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * @Author xiaoqiang
 * @Date 2021/8/30 0030 15:41
 * @Version 1.0
 */
@Configuration
public class EnableConfig {

  @Bean(initMethod = "init", destroyMethod = "destroy", name = "template")
  public UserInfo restTemplate() {
    return new UserInfo();
  }
}


