package com.neotech.lesson06;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		/**
		 * Ask the user to enter the height in inches. 
		 * Person should be classified as one of the following: 
		 * • short (under 60 inch) 
		 * • medium (between 60 -72 inch)
		 * • tall (over 72 inch)
		 */
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter you height as inches: ");
		int height = input.nextInt();
		if (height>0 && height <60) {
			System.out.println(" You are short");
		}
		else if(height >= 60 && height <= 72) {
			System.out.println("You are medium");
			
		}
		else if (height >72) {
			System.out.println("You are tall");
			
		}
		else {
			System.out.println("Invalid value");
		}
		
	}

}
