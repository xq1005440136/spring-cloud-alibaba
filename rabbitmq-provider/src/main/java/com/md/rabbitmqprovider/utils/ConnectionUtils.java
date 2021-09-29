package com.md.rabbitmqprovider.utils;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @Author xiaoqiang
 * @Date 2021/9/8 0008 10:44
 * @Version 1.0
 */
public class ConnectionUtils {
  public static Connection getConnection() throws IOException, TimeoutException {
    //定义连接工厂
    ConnectionFactory factory = new ConnectionFactory();
    //设置服务地址
    factory.setHost("192.168.111.129");
    //端口
    factory.setPort(5672);
    //设置账号信息，用户名、密码、vhost
    factory.setUsername("admin");
    factory.setPassword("123456");
    factory.setHandshakeTimeout(300000000);
    factory.setVirtualHost("/");// 设置虚拟机

    // 通过工厂获取连接
    Connection connection = factory.newConnection();
    return connection;
  }

}
