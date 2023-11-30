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
	
	
	/*
    @Desc: In this function we can match the pattern and if the pattern matches it will set the name or it will gives the invalid name    

    @param:It will takes String name as input

    @return: It will cannot return any value void
	 */
	public void setfName(String fName) {
		// It should matching only the pattern which can start with the Caps And Min 3 char in that have
		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}$");
		Matcher m = p.matcher(fName);  
		if(m.matches()) {  
		this.fName = fName;
		}
		else {
			System.out.println("This is invalid");
		}
	}
	
	//It will return String as first Name if user will call the method 	
	public String getfName() {
		return fName;
	}
	
	
	public void setlName(String lName) {
		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}$");
		Matcher m = p.matcher(lName);  
		if(m.matches()) {  
		this.lName = lName;
		}
		else {
			System.out.println("This is invalid");
		}
	}
	
	
	public String getlName() {
		return lName;
	}
	
	
	
	/*
    @Desc: In this function we can match the pattern of email and if the pattern matches it will set the email or it will gives the invalid email    

    @param:It will takes String email as input

    @return: It will cannot return any value its void
	 */
	public void setEmail(String email) {
		// if email is in "abc.xyz@bl.co.in" that formate it will matches the email
		// the validation for the email is E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl& co) and 2 optional (xyz & in) with precise @ and . positions
		Pattern p = Pattern.compile("^abc.[a-z]{0,5}@bl.co.(in)?");
        Matcher m = p.matcher(email);
        if(m.matches()){
            this.email = email;
        }
        else{
            System.out.println("It cannot be matches");
        }
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	public long getMobileNo() {
		return mobileNo;
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
