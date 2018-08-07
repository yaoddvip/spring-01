package com.mr.test;

import org.apache.catalina.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mr.service.UserService;

/**
 * 通过spring整合junit
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-junit.xml")
public class SpringJunit {
    
    //自动导入    autowire="byType"
    @Autowired
    private UserService userService;
    
    @Test
    public void test1() {
        userService.hello();
    }

}
