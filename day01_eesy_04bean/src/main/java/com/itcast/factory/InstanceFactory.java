package com.itcast.factory;

import com.itcast.service.AccountService;
import com.itcast.service.imp.AccountServiceImp;

/**
 * @program: Spring
 * @auther: MuGe
 * @date: 2019/10/17
 * @time: 10:26
 * @description:
 */
public class InstanceFactory {

	public AccountService getAccountService() {
		return new AccountServiceImp();
	}
}
