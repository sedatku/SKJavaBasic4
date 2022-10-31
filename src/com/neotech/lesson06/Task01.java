package com.neotech.lesson06;

public class Task01 {
	public static void main(String[] args) {

		/**
		 * if hour is less than 12 noon, greet with Good Morning 
		 * if hour is greater than or equal 12 noon but less than 3 pm, 
		 * greet with Good Afternoon o if hour
		 * is greater than or equal to 3 pm, greet with Good Evening
		 */

		int hour = 15;

		if (hour < 12) {
			System.out.println("Good morning");
		} else if (hour <15) {
			System.out.println("Good afternoon");
		} else if (hour <=24){
			System.out.println("Good evening");
		}
		else {
			System.out.println("Invalid value");
		}
	}

}
