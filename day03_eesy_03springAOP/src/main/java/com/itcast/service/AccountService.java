package com.itcast.service;

/**
 * @program: Spring
 * @auther: MuGe
 * @date: 2019/11/5
 * @time: 9:51
 * @description:
 */

/**
 * 账户的业务层接口
 */
public interface AccountService {

	/**
	 * 模拟保存账户
	 */
	void saveAccount();

	/**
	 * 模拟更新账户
	 * @param i
	 */
	void updateAccount(int i);

	/**
	 * 删除账户
	 * @return
	 */
	int deleteAccount();


}



