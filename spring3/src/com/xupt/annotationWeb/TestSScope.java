package com.xupt.annotationWeb;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSScope {
	@Test
	public void demo01() {
		String xmlPath="com/xupt/annotationWeb/applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
		StudentAction studentAction=applicationContext.getBean("studentAction",StudentAction.class);
		studentAction.execute();
	}
}
