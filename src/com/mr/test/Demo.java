package com.mr.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mr.service.UserService;

public class Demo {
	
	/**
	 * 自己创建对象的过程
	 * 	多例
	 */
	@Test
	public void test1() {
		//一个类中调用另外一个类的方法
		UserService userService1 = new UserService();
		System.out.println(userService1);//com.mr.service.UserService@58d25a40
		
		
		UserService userService2 = new UserService();
		System.out.println(userService2);//com.mr.service.UserService@1b701da1
	}
	
	/**
	 * 通过spring容器加载UserService
	 */
	@Test
	public void test2() {
		//测试的要求：
		//1：先获取到容器，加载配置文件
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2：从容器中获取到对象
		UserService userService = (UserService)ioc.getBean("xxx");
		//3：调用方法
//		userService.hello("zs");
	}
	
	/**
	 * 测试 scope
	 * 
	 * 	singleton：每次获取到的对象都是同一个对象	
	 * 		com.mr.service.UserService@436e852b
	 * 		com.mr.service.UserService@436e852b
	 * 
	 *  prototype：多例。每次创建都是新的对象
	 * 		com.mr.service.UserService@c46bcd4
			com.mr.service.UserService@3234e239
	 */
	@Test
	public void test3() {
		ApplicationContext ioc= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		UserService userService = (UserService)ioc.getBean("xxx");
		System.out.println(userService);
		
		UserService userService1 = (UserService)ioc.getBean("xxx");
		System.out.println(userService1);
		
	}
	
}
