package com.bean;

public class Hello {

	private String message;
	public Hello() {
		// TODO Auto-generated constructor stub
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public void myInit() {
		System.out.println("Custom init method of Hello class");
	}
	
	public void myDestroy() {
		System.out.println("Custom destroy method of Hello class");
	}
	
}
