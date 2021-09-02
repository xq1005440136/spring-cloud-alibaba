package com.md.conf;

import com.md.common.util.SpringUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @Author xiaoqiang
 * @Date 2021/8/26 0026 15:28
 * @Version 1.0
 */
@Configuration
@Slf4j
public class RedisConfig {

 private  JedisPool jedisPool;



  @Bean
  @ConditionalOnMissingBean(name = "jedisPoolConfig")
  public JedisPoolConfig jedisPoolConfig(@Value("${jedis.maxTotal}") int maxActive,
      @Value("${jedis.maxIdle}") int maxIdle,
      @Value("${jedis.minIdle}") int minIdle,
      @Value("${jedis.maxWaitMillis}") long maxWaitMillis,
      @Value("${jedis.testOnBorrow}") boolean testOnBorrow) {
    JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
    jedisPoolConfig.setMaxTotal(maxActive);
    jedisPoolConfig.setMaxIdle(maxIdle);
    jedisPoolConfig.setMinIdle(minIdle);
    jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
    jedisPoolConfig.setTestOnBorrow(testOnBorrow);

    return jedisPoolConfig;
  }

  @Bean
  public   JedisPool jedisPool(@Value("${jedis.host}") String host,
      @Value("${jedis.password}") String password,
      @Value("${jedis.port}") int port,
      @Value("${jedis.timeout}") int timeout, JedisPoolConfig jedisPoolConfig) {

    log.info("=====创建JedisPool连接池=====");
    if (StringUtils.isNotEmpty(password)) {
      return new JedisPool(jedisPoolConfig, host, port, timeout, password);
    }

    return new JedisPool(jedisPoolConfig, host, port, timeout);
  }
  public static JedisPool getJedisPool(){
    JedisPool jedisPool = SpringUtil.getBean("jedisPool", JedisPool.class);
    return jedisPool;
  }

}
