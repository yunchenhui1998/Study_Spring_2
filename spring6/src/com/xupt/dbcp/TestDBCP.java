package com.xupt.dbcp;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xupt.domain.User;

public class TestDBCP {
	@Test
	public void Demo01() {
		User user=new User();
		user.setId(1);
		user.setUsername("杰克");
		user.setPassword("998");
		String xmlPath="com/xupt/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
		//获得代理类
		UserDAO userDAO=(UserDAO) applicationContext.getBean("userDAO"); 
		userDAO.update(user);
	}
}
