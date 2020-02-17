package com.itcast.dao;

/**
 * @program: Spring
 * @auther: MuGe
 * @date: 2019/10/21
 * @time: 15:54
 * @description:
 */

import com.itcast.domain.Account;
import java.util.List;

/**
 * 账户的持久层接口
 */
public interface AccountDao {

	/**
	 * 查询所有
	 * @return
	 */
	List<Account> findAllAccount();

	/**
	 * 查询一个
	 * @return
	 */
	Account findAccountById(Integer accountId);

	/**
	 * 保存操作
	 * @param account
	 */
	void saveAccount(Account account);

	/**
	 * 更新
	 * @param account
	 */
	void updateAccount(Account account);

	/**
	 * 删除
	 * @param accountId
	 */
	void deleteAccount(Integer accountId);
}
