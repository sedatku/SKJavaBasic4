package com.neotech.lesson11;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		// 1
		// 1 2
		// 1 2 3
		// 1 2 3 4
		// 1 2 3 4 5
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scan.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

		// print the bottom pattern
		// 1 2 3 4
		// 1 2 3
		// 1 2
		// 1

		for (int i = num - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}
