package com.xupt.factory;


/**
 * 实例工厂
 * @author yunchenhui
 *
 */
public class MyBeanFactory {
	
	public UserService createUserService() {
		return new UserServiceImpl();
	}
}
