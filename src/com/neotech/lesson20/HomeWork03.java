package com.neotech.lesson20;

//Write program that have static constructor and observe result.

public class HomeWork03 {

	String message;

	HomeWork03() {
		System.out.println("Message from non-argument constructor: \"constructor cannot be static!\"");
	}

	HomeWork03(String message) {

		this.message = message;
		System.out.println(message + " from String constructor: \"constructor cannot be static!\"");

	}

	public static void main(String[] args) {

		//String message = "Message";
		
		
		HomeWork03 hm1 = new HomeWork03();
		HomeWork03 hm = new HomeWork03("Message");

	}

}
