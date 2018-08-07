package com.mr.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mr.model.Car;

public class Demo4 {

	@Test
	public void test() {
		ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext-car.xml");
		Car car = (Car)ioc.getBean("car");
		System.out.println(car);
	}
}
