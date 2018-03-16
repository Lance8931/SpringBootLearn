package com.ljh;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.ljh.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemo8ApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private UserService userService;
	
	@Before
	public void setUp() {
		userService.deleteAllUsers();
	}
	
	@Test
	public void test() throws Exception {
		userService.create("a", 1);
		userService.create("b", 2);
		userService.create("c", 3);
		userService.create("d", 4);
		userService.create("e", 5);
		userService.create("f", 6);
		
		Assert.assertEquals(6, userService.getAllUsers().intValue());
		
		userService.deleteByName("a");
		userService.deleteByName("e");
		
		System.out.println(userService.getUserByName("b").get("age"));
		
		Assert.assertEquals(4, userService.getAllUsers().intValue());
	}
}
