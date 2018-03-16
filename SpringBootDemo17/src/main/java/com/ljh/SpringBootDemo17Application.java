package com.ljh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringBootDemo17Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemo17Application.class, args);
	}
}
