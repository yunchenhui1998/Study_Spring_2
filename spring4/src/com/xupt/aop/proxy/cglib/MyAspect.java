package com.xupt.aop.proxy.cglib;

public class MyAspect {
	public void before() {
		System.out.println("鸡首2");
	}
	public void after() {
		System.out.println("牛后2");
	}
}
