package com.itcast.dao.imp;

import com.itcast.dao.AccountDao;
import org.springframework.stereotype.Repository;

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
@Repository("accountDao1")
public class AccountDaoImp implements AccountDao {

	public void saveAccount() {
		System.out.println("保存成功1111");
	}
}
