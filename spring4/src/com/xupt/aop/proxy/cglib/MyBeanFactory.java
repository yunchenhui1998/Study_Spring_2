package com.xupt.aop.proxy.cglib;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class MyBeanFactory {
	public static UserServiceImpl createService() {
		//1.目标类
		UserServiceImpl userService=new UserServiceImpl();
		//2.切面类
		MyAspect myAspect=new MyAspect();
		//3.代理类 采用cglib，底层创建目标类的子类
		//3.1核心类
		Enhancer enhancer=new Enhancer();
		//3.2确定父类
		enhancer.setSuperclass(userService.getClass());
		/*3.3设置回调函数,MethodInterceptor接口等效jdk InvocationHandler接口
		 * intercept()等效jdk 的invoke()
		 * 			参数1，参数2，参数3与invoke一样
		 * 			参数4 方法代理
		 * 
		 * */
		enhancer.setCallback(new MethodInterceptor() {
			
			@Override
			public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
				//前
				myAspect.before();
				//执行目标类方法
				Object object = arg1.invoke(userService, arg2);
				//后
				myAspect.after();
				return object;
			}
		});
		//3.4创建代理
		UserServiceImpl proxyService=(UserServiceImpl)enhancer.create();	
		return proxyService;
	}
}
