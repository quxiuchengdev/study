package com.jdbctemplate.dao;

import java.util.Map;

import javax.annotation.Resource;

import org.dozer.DozerBeanMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.jdbctemplate.entity.JdbcTemplateTestEntity;

@Repository
public class JdbcTemplateTestDao {
	
	@Resource(name="jdbcTemplate")
	public JdbcTemplate jdbcTemplate;
	
	public JdbcTemplateTestEntity get(String id){
		
		String sql = "select  id as id ,name as name from hibernatetest where id = ?";
		Map<String, Object> map = jdbcTemplate.queryForMap(sql, id);
		DozerBeanMapper dozer = new DozerBeanMapper();
		//BeanUtils.
		JdbcTemplateTestEntity jdbcTemplateTestEntity = dozer.map(map, JdbcTemplateTestEntity.class);
		return jdbcTemplateTestEntity;
	
	}
	
}
