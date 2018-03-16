package com.ljh.service;

import java.util.Map;

public interface UserService {
	
	/**
	 * 新增一个用户
	 *
	 * @param name
	 * @param age
	 *
	 * @date 2018年02月26日 10:47:53
	 * @author L.J.H
	 */
	void create(String name,Integer age);
	
	/**
	 * 根据name删除一个用户
	 *
	 * @param name
	 *
	 * @date 2018年02月26日 10:48:05
	 * @author L.J.H
	 */
	void deleteByName(String name);
	
	/**
	 * 获取用户总数
	 *
	 * @return
	 *
	 * @date 2018年02月26日 10:48:18
	 * @author L.J.H
	 */
	Integer getAllUsers();
	
	/**
	 * 根据name获取一个用户
	 *
	 * @param name
	 * @return
	 *
	 * @date 2018年02月26日 10:48:30
	 * @author L.J.H
	 */
	Map<String, Object> getUserByName(String name);
	
	/**
	 * 删除所有用户
	 *
	 *
	 * @date 2018年02月26日 10:48:41
	 * @author L.J.H
	 */
	void deleteAllUsers();
}
