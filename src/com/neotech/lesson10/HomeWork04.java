package com.neotech.lesson10;

import java.util.Scanner;

public class HomeWork04 {

	public static void main(String[] args) {

		/**
		 * 2. create a program that will be asking user to apply for a credit card 10
		 * times. as soon you get a "yes" from a user program should stop asking
		 */

		// use a for loop since there is number of iterations
		// ask a max of then times, if you get a yes before get it, break the loop

		Scanner scan = new Scanner(System.in);
	//	String input = "";

		// ask user ten times

		for (int i = 0; i < 10; i++) {
			System.out.println("Do you want to apply for a credit card?");
			String input = scan.next();
			if (input.equalsIgnoreCase("yes")) {
				System.out.println("Perfect, good choice");
				break;
			}

		}
		System.out.println("");

	}

}
