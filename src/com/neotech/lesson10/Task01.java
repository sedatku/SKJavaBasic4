package com.neotech.lesson10;

public class Task01 {

	public static void main(String[] args) {
		//
		// print this structure using a nested for loop.
		// 1
		// 22
		// 333
		// 4444
		// 55555

		// iterate through row 5 times
		for (int row = 1; row <= 5; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row);
			}
			System.out.println();

		}

		for (int j = 4; j >= 1; j--) {
			for (int k = 1; k <= j; k++) {
				System.out.print(k);
			}
			System.out.println();
		}

	}

}
