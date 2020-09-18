package com.app.demo.hello.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.app.demo.hello.HelloMaven;

public class HelloMavenTest {

	private static HelloMaven hello;
	
	@BeforeAll
	public static void setUp() {
		hello=new HelloMaven();
	}
	
	@Test
	public void testSayHelloByName() {
		String name="amit";
		assertEquals("Hello "+name+" Welcome to Junit5 with Maven", hello.sayHello(name));
	}
}
