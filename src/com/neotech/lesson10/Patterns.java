package com.neotech.lesson10;

public class Patterns {

	public static void main(String[] args) {
		/**
		 
		 * 
		 **
		 ***
		 ****
		 ***** 
		 */

//		for (int row = 1; row <= 5; row++) {
//			for (int col = 1; col <= row; col++) {
//				System.out.print("*");
//
//			}
//			System.out.println();
//		}
//
//		for (int i = 5; i >= 1; i--) {
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//
//			}
//			System.out.println();
//		}

		///////////////////////////

		for (int row = 1; row <= 6; row++) {
			for (int col = 1; col <= row; col++) {
				System.out.print(row);

			}
			System.out.println();
		}

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);

			}
			System.out.println();
		}

	}

}
