package com.mr.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mr.service.UserService;

public class Demo3 {

	
	@Test
	public void test() {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-auto.xml");
		UserService userService = (UserService)ioc.getBean("userService");
		userService.hello();
	}
}
