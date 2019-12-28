package com.xupt.factory;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStaticFactory {
	@Test
	public void demo01() {
		//自定义工厂
		MyBeanFactory myBeanFactory=new MyBeanFactory();
		UserService userService=myBeanFactory.createUserService();
		userService.addUser();
	}	
	@Test
	public void demo02() {
		//spring工厂
		String xmlPath="com/xupt/factory/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
		UserService userService=applicationContext.getBean("userService", UserService.class);
		userService.addUser();
	}
}
