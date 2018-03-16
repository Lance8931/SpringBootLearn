package com.ljh;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Task {

	public static Random random = new Random();

	public void doTaskOne() throws Exception {
		System.out.println("开始做任务一");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(1000));
		long end = System.currentTimeMillis();
		System.out.println("完成任务一，耗时：" + (end - start));
	}
	
	public void doTaskTwo() throws Exception {
		System.out.println("开始做任务二");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(1000));
		long end = System.currentTimeMillis();
		System.out.println("完成任务二，耗时：" + (end - start));
	}
	
	public void doTaskThree() throws Exception {
		System.out.println("开始做任务三");
		long start = System.currentTimeMillis();
		Thread.sleep(random.nextInt(1000));
		long end = System.currentTimeMillis();
		System.out.println("完成任务三，耗时：" + (end - start));
	}
}
