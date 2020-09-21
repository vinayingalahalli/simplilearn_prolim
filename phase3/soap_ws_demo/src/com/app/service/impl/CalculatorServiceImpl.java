package com.app.service.impl;

import javax.jws.WebService;

import com.app.service.CalculatorService;

@WebService(endpointInterface = "com.app.service.CalculatorService")
public class CalculatorServiceImpl implements CalculatorService{

	@Override
	public String sayHello() {
		
		return "Hello from SOAP Services with JAX-WS";
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

}
