package com.xupt.factory_bean;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


/*
 * 采用环绕通知：MethodInterceptor
 * 
 * 
 * 
 * */
public class MyAspect implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		
		System.out.println("前");
		//手动执行目标方法
		Object object = mi.proceed();
		System.out.println("后");
		return object;
	}
	
}
