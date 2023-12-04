package com.bridgelabz.UserRegistration;


//we can created the custom exception class which can extends from the Exception class 
//when the interupted occured in program the new InvalidPatternException contructor will call exception constructor 
public class InvalidPatternException extends Exception{
	public InvalidPatternException(String message) {
		super(message);
	}
}
