package com.md.controller;

import com.md.api.UserApi;
import com.md.common.constants.Constants;
import com.md.common.utils.ResultReturn;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xiaoqiang
 * @Date 2021/9/8 0008 15:40
 * @Version 1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

  @Autowired
  private UserApi userApi;

  @Autowired
  private RabbitTemplate rabbitTemplate;


  @Autowired
  private Environment env;

  @RequestMapping(value = "/login")
  public ResultReturn<String> login(){
    ResultReturn<String> resultReturn = new ResultReturn<>(Constants.RETURN_STRING_ERROR);





 return null;



  }








}
