package com.mr.service;

import com.mr.dao.UserDao;

public class UserService {
	
	private UserDao userDao ;
	
	public void hello() {
		System.out.println("service的方法被动调用...");
	}

	public UserService() {
	}
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	
}
