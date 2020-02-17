package com.itcast.dao.imp;

import com.itcast.dao.AccountDao;

/**
 * @program: Spring
 * @auther: MuGe
 * @date: 2019/10/15
 * @time: 17:26
 * @description:
 */

/**
 * 账户的持久层实现类
 */
public class AccountDaoImp implements AccountDao {

	public void saveAccount() {
		System.out.println("保存成功");
	}
}
