package com.ljh;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.ljh.entity.User;
import com.ljh.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemo15ApplicationTests {

	@Test
	public void contextLoads() {
	}
	@Autowired
	private UserRepository userRepository;

	@Test
	@Transactional
	public void test() throws Exception {

		// 创建10条记录
		userRepository.save(new User("AAA", 10));
		userRepository.save(new User("BBB", 20));
		userRepository.save(new User("CCC", 30));
		userRepository.save(new User("DDD", 40));
		userRepository.save(new User("EEE", 50));
		userRepository.save(new User("FFF", 60));
		userRepository.save(new User("GGG", 70));
		userRepository.save(new User("HHHHHHHHHHHHHHHHHHHHH", 80));
		userRepository.save(new User("III", 90));
		userRepository.save(new User("JJJ", 100));

		// 省略后续的一些验证操作
	}
}
