package com.md.test;

import com.md.utils.ConnectionUtils;
import com.md.utils.SpringUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;

/**
 * @Author xiaoqiang
 * @Date 2021/9/8 0008 9:53
 * @Version 1.0
 */

public class Send {
  private static  final String QUEUE_NAME = "test_queue";

  private static final Logger log = LoggerFactory.getLogger(Send.class);




  public static void main(String[] args) throws IOException, TimeoutException {
    Connection connection = ConnectionUtils.getConnection();
    Channel channel = connection.createChannel();
    channel.queueDeclare(QUEUE_NAME, false, false, false, null);
    String message = "helloworld";
    channel.basicPublish("",QUEUE_NAME,null,message.getBytes());
    log.info("消息已经发送");
    channel.close();
    connection.close();

  }

}
