package com.ljh.scheduled;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduledTasks {

	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss,SSS");

	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		System.out.println("The time is: " + DATE_FORMAT.format(new Date()));
	}
}
