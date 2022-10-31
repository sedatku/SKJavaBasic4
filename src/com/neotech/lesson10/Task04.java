package com.neotech.lesson10;

public class Task04 {

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

		for (int row = 1; row <= 5; row++) {

			for (int col = 1; col <= row; col++) {
				System.out.print(" " + col);

			}

			System.out.println();
		}
		for (int row1 = 4; row1 >= 1; row1--) {
			for (int col1 = 1; col1 <= row1; col1++) {
				System.out.print(" " + col1);

			}
			System.out.println();
		}

	}

}
