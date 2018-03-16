package com.ljh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootDemo20Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo20Application.class, args);
	}
}
