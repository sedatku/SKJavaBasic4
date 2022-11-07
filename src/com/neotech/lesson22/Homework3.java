package com.neotech.lesson22;

public class Homework3 {

//	Create a class with 3 overloaded private methods.
//    Then call each overloaded methods with specific arguments and observe the results.

	private void greeting(String g1) {
		
		System.out.println(g1 + " How are you doing?");

	}

	private void greeting(String g1, String g2) {
		System.out.println(g1 + " " + g2 + ", How are you this morning?");

	}

	private void greeting(String g1, String g2, String g3) {
		
		System.out.println(g1 + " " + g2 + " " + g3 + " Have a great day!");

	}

	public static void main(String[] args) {
		Homework3 greeting = new Homework3();
		
		greeting.greeting("Hello!");
		greeting.greeting("Good", "Morning");
		greeting.greeting("How", "are" , "you!");

	}

}
