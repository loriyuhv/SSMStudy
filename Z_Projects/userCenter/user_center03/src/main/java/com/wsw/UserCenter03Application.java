package com.wsw;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.wsw.mapper")
public class UserCenter03Application {

    public static void main(String[] args) {
        SpringApplication.run(UserCenter03Application.class, args);
    }

}
