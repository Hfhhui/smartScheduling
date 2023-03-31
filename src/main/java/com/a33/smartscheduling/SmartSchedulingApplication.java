package com.a33.smartscheduling;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.a33.smartscheduling.*.mapper")
@SpringBootApplication
public class SmartSchedulingApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmartSchedulingApplication.class, args);
    }

}
