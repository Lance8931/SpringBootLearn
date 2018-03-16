package com.ljh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootDemo18Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo18Application.class, args);
	}
}
