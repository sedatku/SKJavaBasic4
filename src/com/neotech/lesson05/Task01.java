package com.neotech.lesson05;

public class Task01 {

	public static void main(String[] args) {
		/**
		 * write a program. create a variable day (1 - 7) for every weekday, print
		 * "Today is Monday and we are working" for weekend, print " we are on a break
		 * on weekend"
		 */

		int day = 6;

		if (day == 1) {
			System.out.println("Today is Monday and we are working");
		} else if (day == 2) {
			System.out.println("Today is Tuesday and we are working");
		} else if (day == 3) {
			System.out.println("Today is Wednesday and we are working");
		} else if (day == 4) {
			System.out.println("Today is Thursday and we are working");
		} else if (day == 5) {
			System.out.println("Today is Friday and we are working");
		} else if (day == 6) {
			System.out.println("We are on a break on Weekend");
		} else if (day == 7) {
			System.out.println("We are on a break on Weekend");
		} else {
			System.out.println("Please enter a correct day!!!");
		}

	}

}
