package com.ljh;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import com.ljh.entity.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemo12ApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	@Autowired
	private RedisTemplate<String, User> redisTemplate;

	@Test
	public void test() throws Exception {
		// 保存字符串
		stringRedisTemplate.opsForValue().set("aaa", "你好我好大家好");
		Assert.assertEquals("你好我好大家好", stringRedisTemplate.opsForValue().get("aaa"));

		// 保存对象
		User user = new User("超人", 66);
		redisTemplate.opsForValue().set(user.getUsername(), user);
		
		user = new User("超人1", 663);
		redisTemplate.opsForValue().set(user.getUsername(), user);
		
		user = new User("超人2", 662);
		redisTemplate.opsForValue().set(user.getUsername(), user);
		
		Assert.assertEquals(66, redisTemplate.opsForValue().get("超人").getAge().longValue());
		Assert.assertEquals(663, redisTemplate.opsForValue().get("超人1").getAge().longValue());
		Assert.assertEquals(662, redisTemplate.opsForValue().get("超人2").getAge().longValue());
	}
}
