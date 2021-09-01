package com.md.utils;

import com.md.conf.EnableConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @Author xiaoqiang
 * @Date 2021/8/30 0030 15:45
 * @Version 1.0
 */
@Slf4j
@Component
public class SpringUtils implements ApplicationContextAware, InitializingBean {

  @Autowired
  private Environment env;

  private ApplicationContext applicationContext;

  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    this.applicationContext = applicationContext;
    EnableConfig bean = applicationContext.getBean(EnableConfig.class);
    log.info("bean被实例化了====================="+bean);
    String[] activeProfiles = env.getActiveProfiles();
    log.info("初始化spring容器");
    for (String activeProfile : activeProfiles) {
      System.out.println("激活的配置文件是"+activeProfile);
    }
  }

  @Override
  public void afterPropertiesSet() throws Exception {

  }



}
