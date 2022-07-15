package com.rhl.mcy;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.rhl.mcy.mapper"})
@EnableDubbo
public class ErpApplication {

    public static void main(String[] args) {
        SpringApplication.run(ErpApplication.class,args);
    }
}
