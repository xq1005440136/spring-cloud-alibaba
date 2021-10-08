package com.xiaoqiang;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author xiaoqiang
 * @Date 2021/10/8 0008 10:47
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

}
