package com.bridgelabz.UserRegistration;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	User user;
	
	@Before
	public void setUp() {
		user = new User();
	}
	
	@Test
	public void validateName() {
		// Testing the validation of the first name "Adarsh" it will gives true
		assertTrue(user.validatePassword("Adarshfd"));
		// Testing the validation of the email "adarsh" it will gives the false
		assertTrue(user.validateEmail("adarsh"));
	}
}
