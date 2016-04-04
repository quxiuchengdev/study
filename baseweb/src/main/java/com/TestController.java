package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TestController {
	
	@RequestMapping("test")
	public String Test(){
		System.out.println("springMVC成功");
		return "index";
	}
	
	
}
