package com.itcast.ui;

/**
 * @program: Spring
 * @auther: MuGe
 * @date: 2019/10/15
 * @time: 17:35
 * @description:
 */

import com.itcast.dao.AccountDao;
import com.itcast.service.AccountService;
import com.itcast.service.imp.AccountServiceImp;
import com.sun.org.apache.bcel.internal.util.ClassPath;
import java.applet.AppletContext;
import javafx.application.Application;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * 模拟表现层,用于调用业务层
 */
public class Client {

	/**
	 * 获取spring的IOC核心容器,并根据id获取对象
	 *
	 * ApplicationContext的三个常用实现类:
	 * 		ClassPathXmlApplicationContext:	可以加载类路径下的配置文件,要求配置文件必须在类路径下,不在的话,加载不了
	 * 		FileSystemXmlApplicationContext	可以加载磁盘任意路径下的配置文件(必须有访问权限)
	 * 		AnnotationConfigApplicationContext:	用于读取注解
	 *
	 * 核心容器的两个接口引发的问题:
	 *	ApplicationContext:		单例对象适用
	 *		它在构建核心容器时,创建对象采取的策略是立即加载的方式,一读取完配置文件马上创建配置文件中创建的对象.
	 *	BeanFactory:		多例对象适用
	 *		它在构建核心容器时,创建对象采取的策略是延迟加载的方式,什么时候根据id获取对象了,什么时候才真正创建对象.
	 * @param args
	 */
	public static void main(String[] args) {
		//1.获取核心容器对象
		ApplicationContext ac= new ClassPathXmlApplicationContext("bean.xml");
		//ac = new FileSystemXmlApplicationContext("D:\\IntelliJ IDEA 2019.2\\IDEAWorkspace\\Spring\\day01_eesy_03spring\\src\\main\\resources\\bean.xml");
		//2.根据id获取Bean对象
		AccountService as=(AccountService)ac.getBean("accountService");
		AccountDao accountDao=ac.getBean("accountDao",AccountDao.class);

		System.out.println(as);
		System.out.println(accountDao);
		//as.saveAccount();


		//------BeanFactory------
//		Resource resource = new ClassPathResource("bean.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		AccountService as=(AccountService)factory.getBean("accountService");
//		System.out.println(as);

	}
}
