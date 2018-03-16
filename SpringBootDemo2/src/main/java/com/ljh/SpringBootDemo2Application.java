package com.ljh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemo2Application {

	public static void main(String[] args) {
		// SpringApplication.run(SpringBootDemo2Application.class, args);
		SpringApplication springApplication = new SpringApplication(SpringBootDemo2Application.class);
		// 禁止命令行设置参数
		springApplication.setAddCommandLineProperties(false);
		springApplication.run(args);
	}
}
