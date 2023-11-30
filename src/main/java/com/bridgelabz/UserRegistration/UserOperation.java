package com.bridgelabz.UserRegistration;

import java.util.Scanner;

/*
@Desc: UserOperator is a class which contains operation related to the user related to this specific application like add update and delete. and lso having the User Resistration, Login User etc.
*/

public class UserOperation {
	/*
	 * @Desc: This is a behaviour of User Operator Class, this functionaliuty is
	 * used to register user in the specific application.
	 * 
	 * @param: Its is taking object of user as a parameter
	 * 
	 * @return: Its is returning status whether user was registered successfully or
	 * not
	 */
	Scanner sc = new Scanner(System.in);

	public void registraterUser() {
		User user = new User();

		System.out.println("Enter the first name:");
		user.setfName(sc.next());
		System.out.println("Enter the last name:");
		user.setlName(sc.next());
		System.out.println("Enter the Email:");
		user.setEmail(sc.next());
		System.out.println("Enter the Mobile No:");
		user.setMobileNo(sc.nextLong());
		System.out.println("Enter the password:");
		user.setPassword(sc.next());
	}

}
