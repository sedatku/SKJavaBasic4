package com.neotech.lesson09;

public class HomeWork01 {

	public static void main(String[] args) {
		/**
		 * 1. Print numbers from 1 to 50 except those that are divisible by 3
		 * 
		 * 2. Create a program that will be asking user to apply for a credit card 10
		 * times. As soon you get an "yes" from a user program should stop asking.
		 */

		for (int i = 0; i <= 50; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.print(i + " ");
		}

	}

}
