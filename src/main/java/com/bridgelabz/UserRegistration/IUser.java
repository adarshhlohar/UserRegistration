package com.bridgelabz.UserRegistration;

public interface IUser {
	public boolean validateFirstName(String fName);
	public boolean validateLastName(String lName);
	public boolean validateEmail(String email);
	public boolean validateMobileNo(String mobileNo);
	public boolean validatePassword(String password);
}
