package com.neotech.lesson06;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		/**
		 * 
		 * Do this during the break guys 1. Write a program that asks user to enter
		 * first name and then last name. At the end system should display user’s full
		 * name.
		 * 
		 */

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Please enter your name : ");
		String name = keyboard.next();
		System.out.println("Please enter your last name: ");
		String lastName = keyboard.next();
		System.out.println("Your full name: " + name + " " + lastName);

		System.out.println();

		/**
		 * 2. Write a program that calculates the sum of two numbers entered by the
		 * user.
		 * 
		 */

		System.out.println("enter first number: ");
		int number1 = keyboard.nextInt();
		System.out.println(" enter second number: ");
		int number2 = keyboard.nextInt();
		System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));

		/**
		 * 3. Write a program that asks user to enter two numbers and prints which one
		 * is larger.
		 */

		System.out.println("enter first number: ");
		int number3 = keyboard.nextInt();
		System.out.println(" enter second number: ");
		int number4 = keyboard.nextInt();

		if (number3 < number4) {
			System.out.println(number4 + " is bigger than " + number3);
		} else {
			System.out.println(number3 + " is bigger than " + number4);
		}

	}

}
