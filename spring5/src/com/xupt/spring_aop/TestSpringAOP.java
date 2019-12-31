package com.xupt.spring_aop;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringAOP {
	@Test
	public void demo01() {
		String xmlPath="com/xupt/spring_aop/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
		//获得代理类
		UserService userService=(UserService) applicationContext.getBean("userService");
		userService.addUser();
		userService.deleteUser();
		userService.updateUser();
	}
}
