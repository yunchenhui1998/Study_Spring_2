package com.xupt.collections;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSScope {
	@Test
	public void demo01() {
		String xmlPath="com/xupt/collections/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
		CollData collData=applicationContext.getBean("collData",CollData.class);
		System.out.println(collData);
	}
}
