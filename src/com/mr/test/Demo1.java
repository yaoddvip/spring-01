package com.mr.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.mr.service.UserService;

public class Demo1 {

	/**
	 * 普通方法
	 */
	@Test
	public void test1() {
		UserService userService = new UserService();
//		userService.setNamea("徐浩然");
//		userService.test2();
	}
	
	/**
	 * spring注入
	 * 		赋值：通过di依赖注入
	 */
	@Test
	public void test2() {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService)ioc.getBean("userService");
//		userService.test2();
	}
}
