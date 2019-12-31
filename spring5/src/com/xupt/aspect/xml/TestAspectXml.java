package com.xupt.aspect.xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAspectXml {
	@Test
	public void demo01() {
		String xmlPath="com/xupt/aspect/xml/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
		UserService userService=(UserService) applicationContext.getBean("userService");
		userService.addUser();
		userService.deleteUser();
		userService.updateUser();
	}
}
