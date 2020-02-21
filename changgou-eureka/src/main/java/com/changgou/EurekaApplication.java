package com.changgou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Summary:
 * @Author: YangxingLiu
 * @Since: 2020/2/19 23:15
 */
@SpringBootApplication
//开启Eureka服务
@EnableEurekaServer
public class EurekaApplication {
    /**
     * 加载启动类，以启动类为当前SpringBoot的配置
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
