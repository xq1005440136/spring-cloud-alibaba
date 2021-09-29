package com.md.config;

import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import java.io.IOException;
import java.util.concurrent.TimeoutException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AcknowledgeMode;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.config.SimpleRabbitListenerContainerFactory;
import org.springframework.amqp.rabbit.connection.CachingConnectionFactory;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.amqp.SimpleRabbitListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

/**
 * @Author xiaoqiang
 * @Date 2021/9/8 0008 10:00
 * @Version 1.0
 */
@Configuration
public class RabbitConfig {
  private static final Logger log= LoggerFactory.getLogger(RabbitConfig.class);

  @Autowired
  private Environment env;

  @Autowired
  private CachingConnectionFactory connectionFactory;

  @Autowired
  private SimpleRabbitListenerContainerFactoryConfigurer factoryConfigurer;

  /**
   * 单一消费者
   * @return
   */
  @Bean(name = "singleListenerContainer")
  public SimpleRabbitListenerContainerFactory listenerContainer(){
    SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
    factory.setConnectionFactory(connectionFactory);
    factory.setMessageConverter(new Jackson2JsonMessageConverter());
    factory.setConcurrentConsumers(1);
    factory.setMaxConcurrentConsumers(1);
    factory.setPrefetchCount(1);
//    factory.setTxSize(1);
    factory.setAcknowledgeMode(AcknowledgeMode.AUTO);
    return factory;
  }

  /**
   * 多个消费者
   * @return
   */
  @Bean(name = "multiListenerContainer")
  public SimpleRabbitListenerContainerFactory multiListenerContainer(){
    SimpleRabbitListenerContainerFactory factory = new SimpleRabbitListenerContainerFactory();
    factoryConfigurer.configure(factory,connectionFactory);
    factory.setMessageConverter(new Jackson2JsonMessageConverter());
    factory.setAcknowledgeMode(AcknowledgeMode.NONE);
    factory.setConcurrentConsumers(env.getProperty("spring.rabbitmq.listener.concurrency",int.class));
    factory.setMaxConcurrentConsumers(env.getProperty("spring.rabbitmq.listener.max-concurrency",int.class));
    factory.setPrefetchCount(env.getProperty("spring.rabbitmq.listener.prefetch",int.class));
    return factory;
  }

  @Bean
  public RabbitTemplate rabbitTemplate(){
    connectionFactory.setPublisherConfirms(true);
    connectionFactory.setPublisherReturns(true);
    RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
    rabbitTemplate.setMandatory(true);
    rabbitTemplate.setConfirmCallback(new RabbitTemplate.ConfirmCallback() {
      @Override
      public void confirm(CorrelationData correlationData, boolean ack, String cause) {
        log.info("消息发送成功:correlationData({}),ack({}),cause({})",correlationData,ack,cause);
      }
    });
    rabbitTemplate.setReturnCallback(new RabbitTemplate.ReturnCallback() {
      @Override
      public void returnedMessage(Message message, int replyCode, String replyText, String exchange, String routingKey) {
        log.info("消息丢失:exchange({}),route({}),replyCode({}),replyText({}),message:{}",exchange,routingKey,replyCode,replyText,message);
      }
    });
    return rabbitTemplate;
  }
  //TODO：用户操作日志消息模型（已实现）
  @Bean(name = "logUserQueue")
  public Queue logUserQueue(){
    return new Queue(env.getProperty("log.user.queue.name"),true);
  }
  @Bean
  public DirectExchange logUserExchange(){
    return new DirectExchange(env.getProperty("log.user.exchange.name"),true,false);
  }
  @Bean
  public Binding logUserBinding(){
    return BindingBuilder.bind(logUserQueue()).to(logUserExchange()).with(env.getProperty("log.user.routing.key.name"));
  }



}
