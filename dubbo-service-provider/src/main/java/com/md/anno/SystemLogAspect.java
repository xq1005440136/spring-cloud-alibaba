package com.md.anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.web.servlet.mvc.condition.RequestConditionHolder;

/**
 * @Author xiaoqiang
 * @Date 2021/9/7 0007 9:53
 * @Version 1.0
 */
@Aspect
public class SystemLogAspect {



  @After("anno()")
  public void after(JoinPoint joinPoint){

  }

  @Before("anno()")
  public  void before ( JoinPoint joinPoint){


  }

  @Pointcut("@annotation(com.md.anno.MyAnno)")
  public void anno(){

  }
}
