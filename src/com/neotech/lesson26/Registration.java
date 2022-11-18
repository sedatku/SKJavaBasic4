package com.neotech.lesson26;

//Create Registration Class in which you would have

//variables as email, userName and password that
//have an access scope only within its own class.
//After creating an object of the class user should be
//able to call methods and in each method separately
//pass values to set users email, username and
//password.
//
//Requirements:
//Valid email consider to be only yahoo!
//Valid userName and password cannot be empty and should be of length larger than 6 characters.
//Also valid password cannot contain userName.

public class Registration {
	private String userName, password, email;
	// setter for userName
	public void setUserName(String userName) {
		if (!userName.isEmpty()) {
			if (userName.length() >= 6) {
				this.userName = userName;
			} else {
				System.out.println("Your username can't be shorter than 6 characters!");
			}
		} else {
			System.out.println("Your username can't be empty!");
		}
	}
	// getter for userName
	public String getUserName() {
		return userName;
	}
	// setter for password
	public void setPassword(String password) {
		if (!password.isEmpty()) {
			if (password.length() > 6) {
				if (!password.contains(userName)) {
					this.password = password;
				} else {
					System.out.println("Your password can't contain username!");
				}
			} else {
				System.out.println("Your password can't be shorter than 6 characters!");
			}
		} else {
			System.out.println("Your password can't be empty!");
		}
	}
	// getter for password
	public String getPassword() {
		return password;
	}
	// setter for email
	public void setEmail(String email) {
		if (!email.isEmpty()) {
			if (email.contains("@yahoo")) {
				this.email = email;
			} else {
				System.out.println("Please use a yahoo address");
			}
		} else {
			System.out.println("Email cannot be empty!!!");
		}
	}
	// getter for email
	public String getEmail() {
		return email;
	}
}
