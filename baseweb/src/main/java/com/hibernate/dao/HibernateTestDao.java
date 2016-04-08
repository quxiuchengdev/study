package com.hibernate.dao;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.hibernate.entity.User;

@Repository
public class HibernateTestDao {
	
	@Resource(name="sessionFactory")
	private SessionFactory sessionFactory;
	
	/**
	 * 获取 Session
	 */
	public Session getSession(){  
		return sessionFactory.getCurrentSession();
	}
	
	public void save(User user){
		getSession().saveOrUpdate(user);
	}
}
