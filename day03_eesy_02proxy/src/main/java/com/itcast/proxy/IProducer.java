package com.itcast.proxy;

/**
 * @program: Spring
 * @auther: MuGe
 * @date: 2019/11/2
 * @time: 10:18
 * @description:
 */

/**
 * 对生产厂家要求的接口
 */
public interface IProducer {

	/**
	 * 销售
	 *
	 * @param money
	 */
	public void saleProduct(float money);

	/**
	 * 售后
	 *
	 * @param money
	 */
	public void afterService(float money);

}
