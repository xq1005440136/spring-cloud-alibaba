package com.md;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @Author xiaoqiang
 * @Date 2021/8/30 0030 10:56
 * @Version 1.0
 */
public class ServeletIntilizer extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
    return builder.sources(ClientApplication.class);
   }
}
