package com.itcast.service.impl;

import com.itcast.dao.AccountDao;
import com.itcast.domain.Account;
import com.itcast.service.AccountService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: Spring
 * @auther: MuGe
 * @date: 2019/10/21
 * @time: 15:48
 * @description:
 */

/**
 * 账户的业务层实现类
 */
@Service("accountService")
public class AccountServiceImpl implements AccountService {


	@Autowired
	private AccountDao accountDao;

	public List<Account> findAllAccount() {
		return accountDao.findAllAccount();
	}

	public Account findAccountById(Integer accountId) {
		return accountDao.findAccountById(accountId);
	}

	public void saveAccount(Account account) {
		accountDao.saveAccount(account);
	}

	public void updateAccount(Account account) {
		accountDao.updateAccount(account);
	}

	public void deleteAccount(Integer accountId) {
		accountDao.deleteAccount(accountId);
	}


}
