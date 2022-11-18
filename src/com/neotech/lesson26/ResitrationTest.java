package com.neotech.lesson26;

public class ResitrationTest {

	public static void main(String[] args) {


		Registration r1 = new Registration();
		
		r1.setUserName("johnsmith");
		System.out.println("Your user name: " + r1.getUserName());

		r1.setPassword("World444555");
		System.out.println("Your password: " + r1.getPassword());
		
		r1.setEmail("smithjohn77@yahoo.com");
		System.out.println("Your email address: " + r1.getEmail());
	}
}
