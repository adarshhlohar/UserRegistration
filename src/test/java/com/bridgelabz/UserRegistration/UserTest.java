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
	public void validateFName(){
		//The first letter should be in capital and the String should have min 3 length
		//We can added the custom exception for if the pettern is not matching String
		try {
		assertTrue(user.validateFirstName("Adarsh"));
		assertTrue(user.validateFirstName("adarsh"));
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	@Test
	public void validateLName() {
		//The first letter should be in capital and the String should have min 3 length
		//We can added the custom exception for if the pettern is not matching String
		try {
		assertTrue(user.validateLastName("Lohar"));
		assertTrue(user.validateLastName("lohar"));
		}catch (Exception e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void validateEmail() {
		//The email should be contain As a User need to enter a valid email - E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl
		//& co) and 2 optional (xyz & in) with
		//precise @ and . positions letter should be in capital and the String should have min 3 length
		//We can added the custom exception for if the pettern is not matching String
		
		try{
			assertTrue(user.validateEmail("abc.xyz@bl.co.in"));
			assertTrue(user.validateEmail("Adarsh@gmail.com"));
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	
	@Test
	public void validateMobileNo() {
		//The email should be contain As a User need to enter a valid email - E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl
		//& co) and 2 optional (xyz & in) with
		//precise @ and . positions letter should be in capital and the String should have min 3 length
		//We can added the custom exception for if the pettern is not matching String
		try {
		assertTrue(user.validateMobileNo("91 8764534567"));
		assertTrue(user.validateMobileNo("8465757433"));
		}catch(Exception e) {
			System.out.println(e);
		}
	}

	
	@Test
	public void validatePassword() {
		// Testing the validation of the Password that can contain Starts one capital
		// letter it should contain the letter in small case also it contain the digit
		// and special character its length should be 8 it will gives true
		//We can added the custom exception for if the pettern is not matching String
		try {
		assertTrue(user.validatePassword("Adh7@dgd"));
//		// Testing the validation of the password "ad7@fsda" it will gives the false  the Starting letter is not Capital 
		assertTrue(user.validateEmail("ad7@fsda"));
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
