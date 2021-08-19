package com.shufan.springboot.mbts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.shufan.springboot.mbts.mapper")
public class MbtsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MbtsApplication.class, args);
    }

}
