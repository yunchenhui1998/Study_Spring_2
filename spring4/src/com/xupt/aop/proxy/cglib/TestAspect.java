package com.xupt.aop.proxy.cglib;

import org.junit.Test;

public class TestAspect {
	
	@Test
	public void demo01(){
		UserServiceImpl userService=MyBeanFactory.createService();
		userService.addUser();
		userService.deleteUser();
		userService.updateUser();
	}
}
