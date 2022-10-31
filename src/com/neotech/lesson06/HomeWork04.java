package com.neotech.lesson06;

import java.util.Scanner;

public class HomeWork04 {

	public static void main(String[] args) {

		/*
		 * You are DMV representative and you need to ask customer their age. If they
		 * are 18 and older you will issue a driver license to them, otherwise you will
		 * offer them to get a learners permit.
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your age: ");
		int age = input.nextInt();

		
		if (age >0) {
			
			if (age >= 18) {
				System.out.println("You can have a driver license");
	
			} else if (age >= 16) {
				System.out.println("You can have learners permit");
	
			} 
			else {
				System.out.println("You can't have any permit yet");
			}
			
		}
		else {
			System.out.println("Invalid value");

		}

	}

}
