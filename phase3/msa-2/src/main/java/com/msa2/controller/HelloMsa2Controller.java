package com.msa2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloMsa2Controller {

	@GetMapping("/")
	public String sayHello() {
		return "<h1>Hello from MSA-2</h1>";
	}
}
