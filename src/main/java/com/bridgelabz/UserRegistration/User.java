package com.bridgelabz.UserRegistration;
import java.util.regex.*;

/*
@Desc: In this class we have added all the data we need to validate the data by using the functions 
*/
public class User {
	private String fName;
	private String lName;
	private String email;
	private long mobileNo;
	private String password;
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}$");//. represents single character  
		Matcher m = p.matcher(fName);  
		if(m.matches()) {  
		this.fName = fName;
		}
		else {
			System.out.println("This is invalid");
		}
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "User [fName=" + fName + ", lName=" + lName + ", email=" + email + ", mobileNo=" + mobileNo
				+ ", password=" + password + "]";
	}
	
	
	
}
