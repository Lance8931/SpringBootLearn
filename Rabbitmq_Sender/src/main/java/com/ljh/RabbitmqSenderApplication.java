package com.ljh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 在pom.xml文件中需要引入tomcat的插件，不然会引起注册失败的问题
 *
 * @author L.J.H
 * @version 1.0
 * @created 2018年03月09日 15:01:08
 *
 */
@SpringBootApplication
public class RabbitmqSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqSenderApplication.class, args);
	}
}
