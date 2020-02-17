package com.itcast.service.imp;

import com.itcast.service.AccountService;
import java.util.Date;

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

	//如果是经常变化的数据,并不适用于注入的方式
	private String name;
	private Integer age;
	private Date birthday;

	public AccountServiceImp(String name, Integer age, Date birthday) {
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}

	public void saveAccount() {
		System.out.println("service中save方法执行了..."+name+","+age+","+birthday);
	}

}


