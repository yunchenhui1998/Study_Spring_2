package com.xupt.aspect;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;

public class PerformerAspect {
	public Object spend(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		long start=System.currentTimeMillis();
		System.out.println("开始于"+new Date(start));
		Object object=proceedingJoinPoint.proceed();
		long end=System.currentTimeMillis();
		System.out.println("结束于"+new Date(end));
		System.out.println("总用时"+(end-start)+"毫秒");
		return object;
	}
}
