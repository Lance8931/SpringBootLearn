package com.ljh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class SpringBootDemo21Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo21Application.class, args);
	}
}
