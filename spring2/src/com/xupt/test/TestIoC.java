package com.xupt.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xupt.service.BookService;

public class TestIoC {
	@Test
	public void test01() {
		String xmlPath="applicationContext.xml";
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlPath);
		BookService bookService=(BookService) applicationContext.getBean("bookService");
		bookService.doAddBook();
	}
}
