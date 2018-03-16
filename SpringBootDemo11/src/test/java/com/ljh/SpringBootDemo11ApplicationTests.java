package com.ljh;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.ljh.entity.p.User;
import com.ljh.entity.p.UserRepository;
import com.ljh.entity.s.Message;
import com.ljh.entity.s.MessageRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemo11ApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private MessageRepository messageRepository;
	
	@Test
	@Transactional
	public void test() throws Exception{
		userRepository.save(new User("aaa", 10));
		userRepository.save(new User("bbb", 20));
		userRepository.save(new User("ccc", 30));
		userRepository.save(new User("ddd", 40));
		userRepository.save(new User("eee", 50));
		
		Assert.assertEquals(5, userRepository.count());
		
		messageRepository.save(new Message("o1", "aaaaaaa"));
		messageRepository.save(new Message("o22222222222", "bbbbbbb"));
		messageRepository.save(new Message("o3", "ccccccc"));
		
		Assert.assertEquals(3, messageRepository.count());
	}
}
