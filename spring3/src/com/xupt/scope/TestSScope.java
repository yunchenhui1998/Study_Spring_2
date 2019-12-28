package com.xupt.scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSScope {
	@Test
	public void demo01() {
		String xmlPath="com/xupt/scope/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
		UserService userService=applicationContext.getBean("userService", UserService.class);
		UserService userService2=applicationContext.getBean("userService", UserService.class);
		System.out.println(userService);
		System.out.println(userService2);
	}
}
