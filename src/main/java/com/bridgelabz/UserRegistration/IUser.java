package com.bridgelabz.UserRegistration;

public interface IUser {
	public boolean validateFirstName(String fName) throws InvalidPatternException;
	public boolean validateLastName(String lName) throws InvalidPatternException;
	public boolean validateEmail(String email) throws InvalidPatternException;
	public boolean validateMobileNo(String mobileNo) throws InvalidPatternException;
	public boolean validatePassword(String password) throws InvalidPatternException;
}
