package com.xupt;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xupt.service.AccountService;

public class TestApp {
	@Test
	public void test01() {
		String xmlPath="applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
		AccountService accountService=(AccountService) applicationContext.getBean("accountService");
		accountService.transfer("rose","jack",1000 );
	}
}
