package com.xupt.annotationIoc;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSScope {
	@Test
	public void demo01() {
		String xmlPath="com/xupt/annotationIoc/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
		UserService userService=applicationContext.getBean("userService", UserService.class);
		userService.addUser();;
	}
}
