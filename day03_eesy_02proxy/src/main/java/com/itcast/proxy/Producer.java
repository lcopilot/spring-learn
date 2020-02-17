package com.itcast.proxy;

/**
 * @program: Spring
 * @auther: MuGe
 * @date: 2019/11/2
 * @time: 10:09
 * @description:
 */

/**
 * 生产着
 */
public class Producer implements IProducer{

	/**
	 * 销售
	 * @param money
	 */
	public void saleProduct(float money){
		System.out.println("销售产品,money="+money);
	}

	/**
	 * 售后
	 * @param money
	 */
	public void afterService(float money){
		System.out.println("提供售后服务,money="+money);
	}



}
