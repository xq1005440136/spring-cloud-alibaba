package com.md.anno;

import com.sun.corba.se.spi.ior.IdentifiableFactory;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author xiaoqiang
 * @Date 2021/9/7 0007 9:49
 * @Version 1.0
 */
@Target(ElementType.METHOD)
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface SystemLog {

  String value() default "";


  String describe() default "";

}
