package com.bean;

public class HelloScope {

	private String message;
	public HelloScope() {
		
		System.out.println("No args constructor called");
		
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		System.out.println("setter called");
		this.message = message;
	}
	public HelloScope(String message) {
		super();
		this.message = message;
		System.out.println("Args constructor called");
	}
	
}
