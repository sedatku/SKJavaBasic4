package com.neotech.lesson10;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// ask the user for a number

		System.out.println("Please enter a number: ");
		int input = scan.nextInt();

		// this takes or the incrementing
		for (int row = 1; row <= input; row++) {
			for (int col = 0; col < row; col++) {
				System.out.print(row);
			}
			System.out.println();

		}
		// this takes care of the decrementing section
		for (int row = input - 1; row > 0; row--) {
			for (int col = 0; col < row; col++) {
				System.out.print(row);
			}
			System.out.println();

		}

	}

}
