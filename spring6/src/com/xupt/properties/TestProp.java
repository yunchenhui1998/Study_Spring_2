package com.xupt.properties;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xupt.domain.User;

public class TestProp {
	@Test
	public void Demo01() {
		String xmlPath="com/xupt/properties/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
		//获得代理类
		UserDAO userDAO=(UserDAO) applicationContext.getBean("userDAO"); 
//		userDAO.update(user);
//		List<User> allUser = userDAO.findAll();
//		for(User user:allUser) {
//			System.out.println(user);
//		}
		User user=userDAO.getById(1);
		System.out.println(user);
	}
}
