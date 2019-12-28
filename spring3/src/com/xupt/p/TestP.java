package com.xupt.p;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestP {
	@Test
	public void demo01() {
		String xmlPath="com/xupt/p/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
		Person person=(Person) applicationContext.getBean("person");
		System.out.println(person);		
	}
}
