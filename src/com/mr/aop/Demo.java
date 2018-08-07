package com.mr.aop;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {

    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-aop.xml");
        StuService service = (StuService)ioc.getBean("stuService");
        service.delete();
        service.update();
    }
    
}
