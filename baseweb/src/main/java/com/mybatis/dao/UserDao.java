package com.mybatis.dao;

import java.util.List;

import com.common.annotation.MyBatisDao;
import com.mybatis.entity.User;


@MyBatisDao
public interface UserDao {
	
	  public User get(String id);
	  
	  public List<User> getByUsername(String username);
	  
	  public List<User> getAll();
	  
	  public void insert(User user);
	  
	  public void update(User user);
	  
	  public void delete(String id);
}
