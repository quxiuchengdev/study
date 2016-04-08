package com.hibernate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hibernate.dao.HibernateTestDao;
import com.hibernate.entity.HibernateTest;

@Service
@Transactional(readOnly = false,value="transactionManager_hibernate")
public class HibernateTestService {

	@Autowired
	private HibernateTestDao hibernateTestDao;
	
	public void save(HibernateTest hibernateTest){
		hibernateTestDao.save(hibernateTest);
	}
}
