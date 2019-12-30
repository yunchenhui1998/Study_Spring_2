package com.xupt.aop.proxy.jdk;

import org.junit.Test;

public class TestAspect {
	
	@Test
	public void demo01(){
		UserService userService=MyBeanFactory.createService();
		userService.addUser();
		userService.deleteUser();
		userService.updateUser();
	}
}
