package com.neotech.lesson09;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		/**
		 * Write a program that reads a range of integers (start and end point),
		 * provided by a user and then from that range prints the sum of the even and
		 * odd integers.
		 */

		int start = 0;
		int end = 0;
		int sumEven = 0;
		int sumOdd = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter start point and end point: ");
		start = scan.nextInt();
		end = scan.nextInt();

		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				sumEven += i;

			} else {
				sumOdd += i;
			}
		}

		System.out.println("Sum of Even= " + sumEven);
		System.out.println("Sum of Odd= " + sumOdd);

	}

}
