package com.web;

import java.util.UUID;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.User;

@Controller
public class LoginController {
	
	/**
	 * 正常测试跳转
	 */
	@RequestMapping({"/login","/"})
	public String login(Model model){
		model.addAttribute("message", "OK");
		return "login";
	}
	
	/**
	 * 自动封装json
	 */
	@ResponseBody
	@RequestMapping("/json")
	public User json(){
		User user = new User();
		user.setId(UUID.randomUUID().toString().replace("-", ""));
		user.setUsername("username");
		user.setPassword("password");
		return user;
	}
	
	/**
	 * restfull请求封装
	 */
	@RequestMapping("/restfull/{content}")
	public String restfull(@PathVariable("content")String content,Model model){
		model.addAttribute("message", content);
		return "login";
	}
	
	
}
