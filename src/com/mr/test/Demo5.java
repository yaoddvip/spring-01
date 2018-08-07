package com.mr.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mr.service.UserService;

public class Demo5 {

	
	@Test
	public void test() {
		ApplicationContext ioc = 
				new ClassPathXmlApplicationContext("spring-1.xml","spring-2.xml");
		UserService userService = (UserService)ioc.getBean("userService");
		userService.hello();
	}
	
	@Test
	public void test1() {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-1.xml");
		UserService userService = (UserService)ioc.getBean("userService");
		userService.hello();
	}
}
