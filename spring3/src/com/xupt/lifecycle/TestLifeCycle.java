package com.xupt.lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {
	@Test
	public void demo01() {
		String xmlPath="com/xupt/lifecycle/applicationContext.xml";
		ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
		UserService userService=applicationContext.getBean("userService", UserService.class);
		userService.addUser();
		applicationContext.close();
		//destroy执行条件 1.必须是单例 2.必须close掉
	}
}
