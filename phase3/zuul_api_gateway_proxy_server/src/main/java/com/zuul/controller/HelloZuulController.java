package com.zuul.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloZuulController {
	@GetMapping("/")
	public String sayHello() {
		return "<h1>Hello from ZUUL Api GAteway Proxy Server</h1>";
	}
}
