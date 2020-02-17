package com.itcast.jdbctemplate;

/**
 * @program: Spring
 * @auther: MuGe
 * @date: 2019/11/22
 * @time: 10:32
 * @description:
 */

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * JdbcTemplate的最基本用法
 */
public class JdbcTemplateDemo1 {

	public static void main(String[] args) {
		//数据源
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/eesy_spring");
		dataSource.setUsername("MuGe");
		dataSource.setPassword("123456");

		//1.创建JdbcTemplate对象
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		//2.执行操作
		jdbcTemplate.execute("insert into account(name,money) values ('ccc',1000)");
	}
}


















