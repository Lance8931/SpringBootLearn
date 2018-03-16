package com.ljh.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class BlogProperties{
	
	@Value("${com.ljh.name}")
	private String name;
	
	@Value("${com.ljh.phone}")
	private String phone;

	@Value("${com.ljh.aaa}")
	private String aaa;
	
	@Value("${com.ljh.kkk}")
	private String kkk;
	
	@Value("${com.ljh.yyy}")
	private String yyy;

	public String getYyy() {
		return yyy;
	}

	public void setYyy(String yyy) {
		this.yyy = yyy;
	}

	public String getKkk() {
		return kkk;
	}

	public void setKkk(String kkk) {
		this.kkk = kkk;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAaa() {
		return aaa;
	}

	public void setAaa(String aaa) {
		this.aaa = aaa;
	}
}