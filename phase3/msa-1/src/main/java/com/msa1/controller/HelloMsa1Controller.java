package com.msa1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMsa1Controller {

	
	@GetMapping("/")
	public String sayHello() {
		return "<h1>Hello from MSA-1</h1>";
	}
}
