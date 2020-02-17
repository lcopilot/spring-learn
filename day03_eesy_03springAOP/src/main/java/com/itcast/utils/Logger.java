package com.itcast.utils;

/**
 * @program: Spring
 * @auther: MuGe
 * @date: 2019/11/5
 * @time: 9:59
 * @description:
 */

/**
 * 用于记录日志的工具类,它里面提供了公共的代码
 */
public class Logger {

	/**
	 * 用于打印日志: 让其在切入点方法执行之前执行(切入点方法就是业务层方法)
	 */
	public void printLog(){
		System.out.println("Logger的printLog方法开始记录日志...");
	}
}
