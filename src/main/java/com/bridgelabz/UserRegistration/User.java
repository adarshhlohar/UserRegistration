package com.bridgelabz.UserRegistration;
import java.util.regex.*;

/*
@Desc: In this class we have added all the data we need to validate the data by using the functions 
*/
class User implements IUser{
	private String fName;
	private String lName;
	private String email;
	private String mobileNo;
	private String password;
	
	
	/*
    @Desc: In this function we can match the pattern and if the pattern matches it will set the name or it will gives the invalid name    
    @param:It will takes String name as input
    @return: It will cannot return any value void
	 */
	@Override
	public boolean validateFirstName(String fName) {
//		Use case 1
		// It should matching only the pattern which can start with the Caps And Min 3 char in that have
		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}$");
		Matcher m = p.matcher(fName);  
		if(m.matches()) {  
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
	/*
    @Desc: In this function we can match the pattern and if the pattern matches it will set the name or it will gives the invalid name    
    @param:It will takes String name as input
    @return: It will cannot return any value void
	 */
	@Override
	public boolean validateLastName(String lName) {
//		USe Case 2
		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}$");
		Matcher m = p.matcher(lName);  
		if(m.matches()) {  
			return true;
		}
		else {
			return false;
		}
	}
	
	
	
	
	
	/*
    @Desc: In this function we can match the pattern of email and if the pattern matches it will set the email or it will gives the invalid email    
    @param:It will takes String email as input
    @return: It will cannot return any value its void
	 */
	@Override
	public boolean validateEmail(String email) {
		// if email is in "abc.xyz@bl.co.in" that formate it will matches the email
		// the validation for the email is E.g. abc.xyz@bl.co.in - Email has 3 mandatory parts (abc, bl& co) and 2 optional (xyz & in) with precise @ and . positions
		Pattern p = Pattern.compile("^abc\\.[a-z]{0,5}@bl\\.co\\.(in)?$");
        Matcher m = p.matcher(email);
        if(m.matches()){
        	return true;
        }
        else{
        	return false;
        }
	}
	
	
	/*
    @Desc: In this function we can validate the mobile number if Mobile Number is valid with country code it will set the mobile number or it will give the invalid msg
    @param:It will takes String mobileNo as input and set the mobile no
    @return: It will cannot return any value its void
	 */
	@Override
	public boolean validateMobileNo(String mobileNo) {
		Pattern p = Pattern.compile("^91 [789][0-9]{9}$");
        Matcher m = p.matcher(mobileNo);
    
        if(m.matches()){
        	return true;
        }
        else{
        	return false;
        }
	}
	

	
	
	/*
    @Desc: Here in this function we can set the function it can contaiin 8 character with the first caps letter
    @param:It will takes String password as input and set the  password
    @return: It will cannot return any value its void
	 */
	@Override
	public boolean validatePassword(String password) {
//		Use Case 6 Rule2  Should have at least 1 Upper Case - NOTE – All rules must
		Pattern p = Pattern.compile("^[A-Z](?=.*[a-z])(?=.*\\d).{7,}$");
        Matcher m = p.matcher(password);
    
        if(m.matches()){
        	return true;
        }
        else{
            return false;
        }

	}
	

	
	
//	toString() is a method that is defined in the Object class, which is the root class for all Java classes. The purpose of the toString() method is to return a string representation of the object. It is commonly used for debugging, logging, and to provide a human-readable description of the object.
	@Override
	public String toString() {
		return "User [fName=" + fName + ", lName=" + lName + ", email=" + email + ", mobileNo=" + mobileNo
				+ ", password=" + password + "]";
	}

}
