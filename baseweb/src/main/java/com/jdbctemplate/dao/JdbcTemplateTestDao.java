package com.jdbctemplate.dao;

import java.util.Map;

import javax.annotation.Resource;

import org.dozer.DozerBeanMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jdbctemplate.entity.User;

@Repository
public class JdbcTemplateTestDao {
	
	@Resource(name="jdbcTemplate")
	public JdbcTemplate jdbcTemplate;
	
	public User get(String id){
		
		String sql = "select  id as id ,username as username from user where id = ?";
		Map<String, Object> map = jdbcTemplate.queryForMap(sql, id);
		DozerBeanMapper dozer = new DozerBeanMapper();
		//BeanUtils.
		User user = dozer.map(map, User.class);
		return user;
	
	}
	
}
