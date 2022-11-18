package com.neotech.lesson27;

public class RegistrationTest {

	public static void main(String[] args) {
		Registration r = new Registration();
		System.out.println(" --- Email--- ");
		
		r.setEmail("brain@fox.com");
		System.out.println("Email ->" + r.getEmail());
		
		r.setEmail("unur@yahoo.com");
		System.out.println("Email ->" + r.getEmail());
		
		
		System.out.println("-----USERNAME-----");
		r.setUserName("abcs");
		System.out.println("Username ->" + r.getUserName());
		
		r.setUserName("Abcd123");
		System.out.println("Username ->" + r.getUserName());
		
		System.out.println("-----Pasword-----");
		r.setPassword("123");
		System.out.println("password -> " + r.getPassword());
		
		r.setPassword("Abcd1234567");
		System.out.println("password -> " + r.getPassword());
		
		r.setPassword("cdserdeerre");
		System.out.println("password -> " + r.getPassword());
		
		

	}

}
