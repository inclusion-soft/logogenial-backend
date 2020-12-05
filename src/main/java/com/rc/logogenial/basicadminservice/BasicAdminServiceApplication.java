package com.rc.logogenial.basicadminservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@EnableJpaRepositories
@SpringBootApplication
//@EnableWebSecurity
@CrossOrigin(origins = "*")
public class BasicAdminServiceApplication extends SpringBootServletInitializer{

    public static void main(String[] args) {
        SpringApplication.run(BasicAdminServiceApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(BasicAdminServiceApplication.class);
    }
}
