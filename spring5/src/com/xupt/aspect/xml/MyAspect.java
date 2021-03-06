package com.xupt.aspect.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect{
	
	//前置通知
	//注意 是JoinPoint不是Joinpoint
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("前置通知"+joinPoint.getSignature().getName());
	}
	public void myAfterReturning(JoinPoint joinPoint,Object ret) {
		System.out.println("后置通知"+joinPoint.getSignature().getName()+"-->"+ret);
	}
	public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("前");
		Object object = joinPoint.proceed();
		System.out.println("后");
		return object;
	}
	public void myAfterThrowing(JoinPoint joinPoint,Throwable e) {
		System.out.println("抛出异常"+e.getMessage());
	}
	public void myAfter(JoinPoint joinPoint) {
		System.out.println("最终通知");
	}
}
