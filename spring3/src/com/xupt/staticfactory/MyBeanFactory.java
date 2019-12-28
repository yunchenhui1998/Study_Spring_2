package com.xupt.staticfactory;

public class MyBeanFactory {
	public static UserService createUserService() {
		return new UserServiceImpl();
	}
}
