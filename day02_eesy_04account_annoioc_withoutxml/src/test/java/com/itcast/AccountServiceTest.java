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
import config.SpringConfiguration;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 使用junit单元测试
 * Spring整合junit的配置
 * 		1,导入spring整合junit的jar(坐标)
 * 		2,使用Junit提供的一个注解把原有的main方法替换了,替换成spring提供的
 * 			@Runwith
 * 		3,告知spring的运行器,spring和ioc创建是基于xml还是注解的,并说明位置
 * 			@ContextConfiguration
 * 					locations: 指定xml文件的位置,加上classpath关键字,表示在类路径下
 * 					classes:指定注解类所在地位置
 * 	使用spring 5.x版本的时候,要求junit的jar必须是4.12及以上
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class AccountServiceTest {

	@Autowired
	private AccountService as;


	@Test
	public void testFindAll() {
		//1.获取容器
//		ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");

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
		account.setName("test anno");
		account.setMoney(12345f);
		//1.获取容器
		//ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
		ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
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
