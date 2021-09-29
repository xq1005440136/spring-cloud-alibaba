package com.md.rabbitmqprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xiaoqiang
 * @Date 2021/9/8 0008 9:07
 * @Version 1.0
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

  @RequestMapping(value = "/get")
  public String get(){

    return "hello";
  }
}
