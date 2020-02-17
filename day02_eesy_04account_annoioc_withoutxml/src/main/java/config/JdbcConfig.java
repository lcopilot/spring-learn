package config;

/**
 * @program: Spring
 * @auther: MuGe
 * @date: 2019/10/23
 * @time: 10:33
 * @description:
 */

import com.mchange.v2.c3p0.ComboPooledDataSource;
import javax.sql.DataSource;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * 和spring链接数据库相关的配置类
 */
public class JdbcConfig {

	@Value("${jdbc.driver}")
	private String driver;

	@Value("${jdbc.url}")
	private String url;

	@Value("${jdbc.username}")
	private String username;

	@Value("${jdbc.password}")
	private String password;

	/**
	 * 用于创建一个QueryRunner对象
	 *
	 * @param dataSource
	 * @return
	 */
	@Bean(name = "runner")
	@Scope("prototype")
	public QueryRunner createQueryRunner(@Qualifier("ds2") DataSource dataSource) {

		return new QueryRunner(dataSource);
	}

	/**
	 * 创建数据源对象
	 *
	 * @return
	 */
	@Bean(name = "ds2")
	public DataSource createDataSource() {
		ComboPooledDataSource ds = new ComboPooledDataSource();
		try {
			ds.setDriverClass(driver);
			ds.setJdbcUrl(url);
			ds.setUser(username);
			ds.setPassword(password);
			return ds;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}

	/**
	 * 创建数据源对象
	 *
	 * @return
	 */
	@Bean(name = "ds1")
	public DataSource createDataSource1() {
		ComboPooledDataSource ds = new ComboPooledDataSource();
		try {
			ds.setDriverClass(driver);
			ds.setJdbcUrl(url);
			ds.setUser(username);
			ds.setPassword(password);
			return ds;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}

	}
}
