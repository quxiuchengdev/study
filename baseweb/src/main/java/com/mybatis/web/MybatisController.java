package com.mybatis.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mybatis.entity.User;
import com.mybatis.service.UserService;

@Controller
public class MybatisController {

	@Autowired
	private UserService userService;
	
	
	@ResponseBody
	@RequestMapping("/mybatis/test")
	public User getById(String id){
		return userService.get("11");
	}
	
}
