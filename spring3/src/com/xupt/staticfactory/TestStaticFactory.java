package com.xupt.staticfactory;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStaticFactory {
	@Test
	public void demo01() {
		//自定义工厂
		UserService userService=MyBeanFactory.createUserService();
		userService.addUser();
	}	
	@Test
	public void demo02() {
		//spring工厂
		String xmlPath="com/xupt/staticfactory/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
		UserService userService=applicationContext.getBean("userService", UserService.class);
		userService.addUser();
	}
}
