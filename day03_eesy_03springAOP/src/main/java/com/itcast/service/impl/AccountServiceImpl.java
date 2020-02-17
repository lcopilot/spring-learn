package com.itcast.service.impl;

import com.itcast.service.AccountService;

/**
 * @program: Spring
 * @auther: MuGe
 * @date: 2019/11/5
 * @time: 9:56
 * @description:
 */
public class AccountServiceImpl implements AccountService {

	@Override
	public void saveAccount() {
		System.out.println("保存");
	}

	@Override
	public void updateAccount(int i) {
		System.out.println("更新"+i);
	}

	@Override
	public int deleteAccount() {
		System.out.println("删除");
		return 0;
	}
}
