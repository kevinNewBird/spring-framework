package com.mashibing.analysis.tx.annotation.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.mashibing.analysis.tx.annotation.dao.GlassDaoV2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * description  TransactionConfig <BR>
 * <p>
 * author: zhao.song
 * date: created in 20:45  2021/12/13
 * company: TRS信息技术有限公司
 * version 1.0
 */
@Configuration
@PropertySource("classpath:dbtxconfig.properties")
@ComponentScan(basePackages = "com.mashibing.analysis.tx.annotation")
@EnableTransactionManagement
public class TransactionConfig {

	@Value("${jdbc.username}")
	private String username;
	@Value("${jdbc.password}")
	private String password;
	@Value("${jdbc.url}")
	private String url;
	@Value("${jdbc.driverClassName}")
	private String driverClassName;

	@Bean
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setUrl(url);
		dataSource.setDriverClassName(driverClassName);
		return dataSource;
	}

	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		return new JdbcTemplate(dataSource);
	}

	@Bean
	public PlatformTransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

}
