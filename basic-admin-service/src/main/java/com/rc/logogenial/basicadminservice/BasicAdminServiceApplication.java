package com.rc.logogenial.basicadminservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@EnableEurekaClient
@EnableJpaRepositories
@SpringBootApplication
@CrossOrigin(origins = "*")
public class BasicAdminServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicAdminServiceApplication.class, args);
    }

}
