package com.ljh;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ljh.entity.BlogProperties;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemo2ApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private BlogProperties blogProperties;
	
	@Test
	public void getProperties() throws Exception{
		System.out.println(blogProperties.getName());
		System.out.println(blogProperties.getPhone());
		System.out.println(blogProperties.getAaa());
		System.out.println(blogProperties.getKkk());
		System.out.println(blogProperties.getYyy());
	}
}
