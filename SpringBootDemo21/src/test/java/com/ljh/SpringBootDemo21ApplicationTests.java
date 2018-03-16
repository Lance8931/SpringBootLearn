package com.ljh;

import java.util.concurrent.Future;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBootDemo21ApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private Task task;

	@Autowired
	private TaskAsync taskAsync;
	
	@Autowired
	private TaskAsyncFuture taskAsyncFuture;

	 @Test
	 public void test() throws Exception {
	 task.doTaskOne();
	 task.doTaskTwo();
	 task.doTaskThree();
	 }

	/**
	 * 三个函数的时候已经是异步执行了。
	 * 主程序在异步调用之后，主程序并不会理会这三个函数是否执行完成了，
	 * 由于没有其他需要执行的内容，所以程序就自动结束了，
	 * 导致了不完整或是没有输出任务相关内容的情况。
	 *
	 * @throws Exception
	 *
	 * @date 2018年03月09日 15:44:26
	 * @author L.J.H
	 */
	@Test
	public void testAsync() throws Exception {
		taskAsync.doTaskOne();
		taskAsync.doTaskTwo();
		taskAsync.doTaskThree();
	}
	
	@Test
	public void testAsyncFuture() throws Exception {
		long start = System.currentTimeMillis();
		
		Future<String> task1 = taskAsyncFuture.doTaskOne();
		Future<String> task2 = taskAsyncFuture.doTaskTwo();
		Future<String> task3 = taskAsyncFuture.doTaskThree();
		
		while(true) {
			if(task1.isDone() && task2.isDone() && task3.isDone()) {
				break;
			}
			Thread.sleep(1000);
		}
		long end = System.currentTimeMillis();
		System.out.println("任务全部完成，总耗时："+ (end - start));
	}
}
