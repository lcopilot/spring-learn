package com.itcast.ui;

/**
 * @program: Spring
 * @auther: MuGe
 * @date: 2019/10/15
 * @time: 17:35
 * @description:
 */

import com.itcast.dao.imp.AccountDaoImp;
import com.itcast.factory.BeanFactory;
import com.itcast.service.AccountService;
import com.itcast.service.imp.AccountServiceImp;

/**
 * 模拟表现层,用于调用业务层
 */
public class Client {

	public static void main(String[] args) {
		//AccountService as = new AccountServiceImp();
		for (int i = 0; i < 5; i++) {
			AccountService as= (AccountService) BeanFactory.getBean("accountService");
			System.out.println(as);
			as.saveAccount();
		}

	}
}
