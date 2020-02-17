package com.itcast;

/**
 * @program: Spring
 * @auther: MuGe
 * @date: 2019/10/22
 * @time: 14:36
 * @description:
 */

import com.itcast.domain.Account;
import com.itcast.service.AccountService;
import java.util.List;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 使用junit单元测试
 */
public class testAccountServiceTest {

	@Test
	public void testFindAll() {
		//1.获取容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		//2.得到业务层对象
		AccountService as = ac.getBean("accountService", AccountService.class);
		//3.执行方法
		List<Account> accounts = as.findAllAccount();
		for (Account account : accounts) {
			System.out.println(account);
		}
	}

	@Test
	public void testFindOne() {
		//1.获取容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		//2.得到业务层对象
		AccountService as = ac.getBean("accountService", AccountService.class);
		//3.执行方法
		Account account = as.findAccountById(1);
		System.out.println(account);
		
	}

	@Test
	public void testSave() {
		Account account = new Account();
		account.setName("test");
		account.setMoney(12345f);
		//1.获取容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		//2.得到业务层对象
		AccountService as = ac.getBean("accountService", AccountService.class);
		//3.执行方法
		as.saveAccount(account);

	}

	@Test
	public void testUpdate() {
		//1.获取容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		//2.得到业务层对象
		AccountService as = ac.getBean("accountService", AccountService.class);
		//3.执行方法
		Account account = as.findAccountById(4);
		account.setMoney(2441321f);
		as.updateAccount(account);

	}

	@Test
	public void testDelete() {
		//1.获取容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		//2.得到业务层对象
		AccountService as = ac.getBean("accountService", AccountService.class);
		//3.执行方法
		as.deleteAccount(4);
	}
}
