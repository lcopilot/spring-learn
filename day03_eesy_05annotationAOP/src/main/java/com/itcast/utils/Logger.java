package com.itcast.utils;

/**
 * @program: Spring
 * @auther: MuGe
 * @date: 2019/11/5
 * @time: 9:59
 * @description:
 */

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * 用于记录日志的工具类,它里面提供了公共的代码
 */
@Component("logger")
@Aspect	//表示当前类是一个切面类
@EnableAspectJAutoProxy
public class Logger {

	@Pointcut("execution( * com.itcast.service.impl.*.*(..))")
	public void pt1(){}

	/**
	 * 前置通知
	 */
	//@Before("pt1()")
	public void beforePrintLog(){
		System.out.println("Logger的beforePrintLog方法开始记录日志...前置");
	}
	/**
	 * 后置通知
	 */
	//@AfterReturning("pt1()")
	public void afterReturningPrintLog(){
		System.out.println("Logger的afterReturningPrintLog方法开始记录日志...后置");
	}
	/**
	 * 异常通知
	 */
	//@AfterThrowing("pt1()")
	public void afterThrowingPrintLog(){
		System.out.println("Logger的afterThrowingPrintLog方法开始记录日志...异常");
	}
	/**
	 * 最终通知
	 */
	//@After("pt1()")
	public void afterPrintLog(){
		System.out.println("Logger的afterPrintLog方法开始记录日志...最终");
	}

	/**
	 * 环绕通知
	 * 问题:
	 * 		当我们配置了环绕通知后,切入点方法没有执行
	 * 分析:
	 * 		通过对比动态代理中环绕通知代码,发现动态代理的环绕通知有明确的切入点方法调用,而我们的代码中没有
	 * 解决:
	 * 		Spring框架为我们提供了一个接口:ProceedingJoinPoint 该接口有一个方法proceed(), 此方法就相当于明确调用切入点方法
	 * 		该接口可以作为环绕通知的方法参数,在程序执行时,spring框架会为我们提供该接口的实现类供我们使用
	 *
	 * spring中的环绕通知:
	 * 		它是spring框架为我们提供的一种可以在代码中手动控制增强方法何时执行的方式
	 *
	 */
	@Around("pt1()")
	public Object aroundPrintLog(ProceedingJoinPoint point){
		Object rtValue=null;
		try {
			Object[] args=point.getArgs();//方法执行所需要的参数

			System.out.println("Logger的aroundPrintLog方法开始记录日志...前置");

			rtValue=point.proceed(args);//明确调用业务层方法(切入点方法)

			System.out.println("Logger的aroundPrintLog方法开始记录日志...后置");

			return rtValue;
		} catch (Throwable throwable) {
			System.out.println("Logger的aroundPrintLog方法开始记录日志...异常");
			throw new RuntimeException(throwable);
		}finally {
			System.out.println("Logger的aroundPrintLog方法开始记录日志...最终");
		}

	}
}
