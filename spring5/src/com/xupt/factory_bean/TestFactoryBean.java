package com.xupt.factory_bean;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestFactoryBean {
	@Test
	public void demo01() {
		String xmlPath="com/xupt/factory_bean/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
		//获得代理类
		UserService userService=(UserService) applicationContext.getBean("proxyService");
		userService.addUser();
		userService.deleteUser();
		userService.updateUser();
	}
}
