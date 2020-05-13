package com.rc.logenialbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories
@SpringBootApplication
public class LogogenialBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(LogogenialBackendApplication.class, args);
	}

}
