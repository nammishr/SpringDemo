package com.app.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(value = "com.app")
@EntityScan("com.app.model")
public class SpringdemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(SpringdemoApplication.class, args);
	}
}
