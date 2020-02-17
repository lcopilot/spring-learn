package com.itheima.service;

/**
 * @program: Spring
 * @auther: MuGe
 * @date: 2019/11/25
 * @time: 9:32
 * @description:
 */

import com.itheima.domain.Account;

/**
 * 账户的业务层接口
 */
public interface AccountService {

	/**
	 * 根据id查询账户信息
	 * @param accountId
	 * @return
	 */
	Account findAccountById(Integer accountId);

	/**
	 * 转账
	 * @param sourceName	转出账户
	 * @param targetName	转入账户
	 * @param money		金额
	 */
	void transfer(String sourceName, String targetName, Float money);



}
