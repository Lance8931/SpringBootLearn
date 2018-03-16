package com.ljh;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.test.context.junit4.SpringRunner;

import com.ljh.entity.User;
import com.ljh.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemo18ApplicationTests {

	@Test
	public void contextLoads() {
	}


	@Autowired
	private UserRepository userRepository;

	@Autowired
	private CacheManager cacheManager;

	@Test
	public void test() throws Exception {

		userRepository.save(new User("AAA", 200));
		User u1 = userRepository.findByName("AAA");
		System.out.println("First time:" + u1.getAge());

		User u2 = userRepository.findByName("AAA");
		System.out.println("Second time:" + u2.getAge());
		
		u2.setAge(300);
		userRepository.save(u2);
		
		User u3 = userRepository.findByName("AAA");
		System.out.println("Third time:" + u3.getAge());

		Cache cache = cacheManager.getCache("users");
		System.out.println(cache.getName());
	}
}
