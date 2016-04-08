package com.mybatis.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mybatis.dao.UserDao;
import com.mybatis.entity.User;

@Service
@Transactional(value="transactionManager_mybatis")
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public User get(String id){
		return userDao.get(id);
	}

}
