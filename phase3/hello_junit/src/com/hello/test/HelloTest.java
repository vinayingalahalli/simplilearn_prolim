package com.hello.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.hello.Hello;

public class HelloTest {

	private static Hello hello;
	@BeforeAll
	public static void setUpHello() {
		hello=new Hello();
	}
	
	@Test
	public void testSayHello() {
		assertEquals("Hello from Junit5.", hello.sayHello());
	}
	
}
