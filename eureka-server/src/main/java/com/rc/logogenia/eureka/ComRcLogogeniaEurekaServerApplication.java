package com.rc.logogenia.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ComRcLogogeniaEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComRcLogogeniaEurekaServerApplication.class, args);
    }

}
