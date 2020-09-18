package com.app.service;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MyServiceImplTest {

	private static MyService service;
	@BeforeAll
	public static void setUp() {
		service=new MyServiceImpl();
	}
	@Test
	void testIsValidPan() {
		assertTrue(service.isValidPan("ABCDE1111S"));
	}
	
	@Test
	void testIsValidPanForNull() {
		//assertNull(service.isValidPan(null));
		assertFalse(service.isValidPan(null));
	}

	@Test
	void testIsValidPrimeNumber() {
		fail("Not yet implemented");
	}

	@Test
	void testIsValidIndianMobileNumber() {
		assertTrue(service.isValidIndianMobileNumber("+91-1234567890"));
	}

}
