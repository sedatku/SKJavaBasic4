package com.neotech.lesson09;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		/**
		 * 
		 * 2. Create a program that will be asking user to apply for a credit card 10
		 * times. As soon you get an "yes" from a user program should stop asking.
		 */

		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 10; i++) {

			System.out.println("Do you want to apply a credit card?");
			String answear = scan.next();
			if (answear.equalsIgnoreCase("yes")) {
				System.out.println("Congratulations! You will have a credit card");
				break;

			}
			
		}
		System.out.println("You didn't want to have a credit card. Have a great day!");
	}

}
