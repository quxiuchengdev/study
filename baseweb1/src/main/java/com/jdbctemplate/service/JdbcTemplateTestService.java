package com.jdbctemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jdbctemplate.dao.JdbcTemplateTestDao;
import com.jdbctemplate.entity.JdbcTemplateTestEntity;

@Service
@Transactional(readOnly=false,value="transactionManager_spring")
public class JdbcTemplateTestService {
	
	@Autowired
	private JdbcTemplateTestDao jdbcTemplateTestDao;
	
	public JdbcTemplateTestEntity get(String id){
		return jdbcTemplateTestDao.get(id);
	}
	
}
