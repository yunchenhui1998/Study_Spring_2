package com.xupt.lifecycle;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("后方法"+arg1);
		
		return Proxy.newProxyInstance(MyBeanPostProcessor.class.getClassLoader(), 
									  arg0.getClass().getInterfaces(), 
									  new InvocationHandler() {
										
										@Override
										public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
											// TODO Auto-generated method stub
											System.out.println("--------开启事务-------------");
											Object obj=method.invoke(arg0, args);
											System.out.println("----------提交事务------------");
											return obj;
										}
									});
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		System.out.println("前方法"+arg1);
		return arg0;
	}

}
