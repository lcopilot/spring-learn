package com.itcast.service.imp;

import com.itcast.dao.AccountDao;
import com.itcast.dao.imp.AccountDaoImp;
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

	private AccountDao accountDao = new AccountDaoImp();

	public AccountServiceImp() {
		System.out.println("对象创建了");
	}

	public void saveAccount() {
		accountDao.saveAccount();


	}
}


