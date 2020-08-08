package com.rc.logogenial.archivosservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@EnableEurekaClient
@EnableJpaRepositories
@SpringBootApplication
@CrossOrigin(origins = "*")
public class ArchivosServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArchivosServiceApplication.class, args);
    }

}
