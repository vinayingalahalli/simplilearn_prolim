package com.hello.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HelloLifeCycleTest {

	@BeforeAll
	public static void testBeforeAll() {
		System.out.println("Hello from @BeforeAll");
	}
	
	
	@BeforeEach
	public void testBeforeEach() {
		System.out.println("Hello from @BeforeEach");
	}
	
	@Test
	public void test1() {
		System.out.println("Hello from @Test from method test1()");
	}
	@Test
	public void test2() {
		System.out.println("Hello from @Test from method test2()");
	}
	
	@AfterEach
	public void testAfterEach() {
		System.out.println("Hello from @AfterEach");
	}
	
	@AfterAll
	public static void testAfterAll() {
		System.out.println("Hello from @AfterAll");
	}
	
}
