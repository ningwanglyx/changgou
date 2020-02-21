package com.changgou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Summary:
 * @Author: YangxingLiu
 * @Since: 2020/2/21 0:18
 */
@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
@MapperScan(basePackages = "com.changgou.mapper") //开启包扫描，tk包下面的MapperScan
public class GoodApplication {
    public static void main(String[] args) {
        SpringApplication.run(GoodApplication.class, args);

    }
}
