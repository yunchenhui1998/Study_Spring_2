package com.xupt.aspect.annotation;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect{
	
	//前置通知
	//注意 是JoinPoint不是Joinpoint
	//切入点当前有效
	//@Before("execution(* com.xupt.aspect.annotation.UserServiceImpl.*(..))")
	public void myBefore(JoinPoint joinPoint) {
		System.out.println("前置通知"+joinPoint.getSignature().getName());
	}
	//声明公共切入点
	@Pointcut("execution(* com.xupt.aspect.annotation.UserServiceImpl.*(..))")
	public  void myPointCut() {
		
	}	
//	@AfterReturning(value="myPointCut()",returning="ret")
	public void myAfterReturning(JoinPoint joinPoint,Object ret) {
		System.out.println("后置通知"+joinPoint.getSignature().getName()+"-->"+ret);
	}
//	@Around(value="myPointCut()")	
	public Object myAround(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("前");
		Object object = joinPoint.proceed();
		System.out.println("后");
		return object;
	}
//	@AfterThrowing(value="myPointCut()",throwing="e")
	public void myAfterThrowing(JoinPoint joinPoint,Throwable e) {
		System.out.println("抛出异常"+e.getMessage());
	}
//	@After(value = "myPointCut()")
	public void myAfter(JoinPoint joinPoint) {
		System.out.println("最终通知");
	}
}
