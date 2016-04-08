package com.hibernate.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hibernate.entity.User;
import com.hibernate.service.HibernateTestService;


@Controller
public class HibernateTestController {

	@Autowired
	private HibernateTestService hibernateTestService;
	
	@RequestMapping("/hibernate/test/{aa}")
	public String testHibernate(@PathVariable("aa")String aa){
//		User test = new User();
//		test.setId("11");
//		test.setUsername("test");
//		hibernateTestService.save(test);
		System.out.println("aaaa,"+aa);
		return "index";
	}
}
