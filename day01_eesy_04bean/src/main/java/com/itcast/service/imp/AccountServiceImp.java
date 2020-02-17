package com.itcast.service.imp;

import com.itcast.service.AccountService;

/**
 * @program: Spring
 * @auther: MuGe
 * @date: 2019/10/15
 * @time: 17:21
 * @description:
 */

/**
 * 账户的业务层实现类
 */
public class AccountServiceImp implements AccountService {


	public AccountServiceImp() {
		System.out.println("对象创建了");
	}

	public void saveAccount() {
		System.out.println("service中save方法执行了");

	}
	public void init() {
		System.out.println("对象初始化");

	}
	public void destroy() {
		System.out.println("对象消亡");

	}
}


