package com.jdbctemplate.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jdbctemplate.entity.User;
import com.jdbctemplate.service.JdbcTemplateTestService;

@Controller
public class JdbcTemplateTestController {

	@Autowired
	private JdbcTemplateTestService jdbcTemplateTestService;
	
	@ResponseBody
	@RequestMapping("/jdbcTemplete/test")
	public User test(HttpServletRequest httpRequest){
		User entity = jdbcTemplateTestService.get("11");
	//	System.out.println(entity);
		return entity;
	}
	
}
