package com.hslee.yummyeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class YummyEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(YummyEurekaServerApplication.class, args);
    }

}
