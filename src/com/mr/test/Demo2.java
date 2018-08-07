package com.mr.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mr.dao.UserDao;
import com.mr.service.UserService;

public class Demo2 {

	/**
	 * 普通方法
	 */
	@Test
	public void test() {
		UserService userService = new UserService();
		userService.hello();
	}
	
	/**
	 * 使用spring之后
	 */
	@Test
	public void test1() {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("spring.xml");
		UserService userService = (UserService)ioc.getBean("userService");
		userService.hello();
	}
	
	
}
