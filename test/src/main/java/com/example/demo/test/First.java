package com.example.demo.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class First {
	
	@RequestMapping("aaa")
	public String aaa() {
		return "aaa";
	}
	
	@RequestMapping("bbb")
	public String bbb() {
		return "bbb";
	}
	
	
	@RequestMapping("list")
	public String list() {
		return "list";
	}
	
	@RequestMapping("form")
	public String form() {
		return "form";
	}
	
	@RequestMapping("login")
	public String login() {
		return "login";
	}
}
