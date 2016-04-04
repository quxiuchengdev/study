package com.jdbctemplate.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jdbctemplate.entity.JdbcTemplateTestEntity;
import com.jdbctemplate.service.JdbcTemplateTestService;

@Controller
public class JdbcTemplateTestController {

	@Autowired
	private JdbcTemplateTestService jdbcTemplateTestService;
	
	@RequestMapping("/jdbcTemplete/test")
	public String test(HttpServletRequest httpRequest){
		JdbcTemplateTestEntity entity = jdbcTemplateTestService.get("11");
		System.out.println(entity);
		return "index";
	}
	
}
