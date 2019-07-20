package com.wxh.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * 项目入口程序
 */
/*
 * @EnableAutoConfiguration 开启自动化配置
 * 项目中添加了 spring-boot-starter-web  依赖
 * 会自动进行spring 和 spring mvc的配置
 * @ComponentScan 进行包扫描
 */

@SpringBootApplication
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}
