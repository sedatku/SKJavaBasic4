package com.neotech.lesson11;

import java.util.Scanner;

public class HomeWork01 {

	public static void main(String[] args) {
		// Ask the user to enter an integer and build the following pattern:
		// Hint: use scanner, if user entered number 5, there should be 5 rows
		// int the first row, 0 spaces, (2 * 5) - 1 stars
		/**
		 
		 *********
		  *******
		   *****
		    ***
		     *
		 
		 
		 */

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = input.nextInt();

		for (int i = 1; i <= num; i++)// I want to have as many rows as the number user enters
		{

			// when i = 1, there are 0 space
			// when i = 2, there are 1 space

			for (int j = 1; j < i; j++) // this is for the columns be careful of new line
			{
				System.out.print(" ");

			}
			// what about starts
			// when i = 1 we have 2 * 5 -1
			// when i =2 we have 2 * 4 - 1
			// when i = 3 we have 2 * 3 - 1

			for (int k = 1; k <= 2 * (num - i) + 1; k++) {
				System.out.print("*");

			}
			System.out.println();
		}

	}

}
