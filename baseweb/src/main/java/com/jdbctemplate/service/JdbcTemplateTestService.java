package com.jdbctemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jdbctemplate.dao.JdbcTemplateTestDao;
import com.jdbctemplate.entity.User;

@Service
@Transactional(value="transactionManager_spring")
public class JdbcTemplateTestService {
	
	@Autowired
	private JdbcTemplateTestDao jdbcTemplateTestDao;
	
	@Transactional(readOnly=false)
	public User get(String id){
		return jdbcTemplateTestDao.get(id);
	}
	
}
