package com.hibernate.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hibernate.entity.HibernateTest;
import com.hibernate.service.HibernateTestService;


@Controller
public class HibernateTestController {

	@Autowired
	private HibernateTestService hibernateTestService;
	
	@RequestMapping("/hibernate/test")
	public void testHibernate(){
		HibernateTest test = new HibernateTest();
		test.setId("11");
		test.setName("test");
		hibernateTestService.save(test);
		System.out.println("aaaa");
	}
}
