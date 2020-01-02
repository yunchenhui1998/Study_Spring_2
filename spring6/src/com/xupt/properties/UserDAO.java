package com.xupt.properties;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.SingleColumnRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.xupt.domain.User;

public class UserDAO extends JdbcDaoSupport{
	//extends JdbcDaoSupport替代
//	private JdbcTemplate jdbcTemplate;
//	
//	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//		this.jdbcTemplate = jdbcTemplate;
//	}

	public void update(User user) {
		String sql="update user set username=?,password=? where id=?";
		Object[] args= {user.getUsername(),user.getPassword(),user.getId()};
		this.getJdbcTemplate().update(sql, args);
	}

	public List<User> findAll() {
		return this.getJdbcTemplate().query("select * from user",new BeanPropertyRowMapper(User.class));
	}

	public User getById(int i) {
		return this.getJdbcTemplate().queryForObject("select * from user where id = ?",BeanPropertyRowMapper.newInstance(User.class),i);
	}
}
