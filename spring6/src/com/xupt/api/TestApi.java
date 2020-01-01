package com.xupt.api;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class TestApi {
	public static void main(String[] args) {
		//创建数据源（连接池）dbcp
		BasicDataSource dataSource=new BasicDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/spring");
		dataSource.setUsername("root");
		dataSource.setPassword("123456");
		JdbcTemplate jdbcTemplate=new JdbcTemplate();
		jdbcTemplate.setDataSource(dataSource);
		jdbcTemplate.update("insert into user(username,password) values(?,?);","tom","998");
	}
}
