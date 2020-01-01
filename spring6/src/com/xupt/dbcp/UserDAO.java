package com.xupt.dbcp;

import org.springframework.jdbc.core.JdbcTemplate;

import com.xupt.domain.User;

public class UserDAO {
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public void update(User user) {
		String sql="update user set username=?,password=? where id=?";
		Object[] args= {user.getUsername(),user.getPassword(),user.getId()};
		jdbcTemplate.update(sql, args);	
	}
}
