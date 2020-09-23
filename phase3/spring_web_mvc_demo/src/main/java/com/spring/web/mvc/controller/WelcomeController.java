package com.spring.web.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	@RequestMapping("/")
	public String sayHello() {
		return "welcome";
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/hello")
	public String helloUser(@RequestParam String fname,Model model) {
		model.addAttribute("user", fname);
		return "dashboard";
	}
}
