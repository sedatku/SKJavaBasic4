package com.neotech.lesson10;

public class Task03 {

	public static void main(String[] args) {
		/*
		  
		*********
		 *******
		  *****
		   ***
		    * 
		
		 */

		for (int row = 5; row >= 1; row--) {

			for (int k = 5; k >= row; k--) {
				System.out.print(" ");

			}

			for (int col = 1; col <= (2 * row - 1); col++) {
				System.out.print("*");

			}
			System.out.println();

		}

	}

}
