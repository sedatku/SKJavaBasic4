package com.neotech.lesson11;

public class Task01 {

	public static void main(String[] args) {
//		String[] names = new String[3];
//		int[] numbers = new int[3];
//		names[0] = "John";
//		names[1] = "Anna";
//		names[2] = "Michael";
//
//		for (int j = 0; j < numbers.length; j++) {
//			numbers[j] = j;
//		}
//
//		for (int i = 0; i < names.length; i++) {
//
//			System.out.print(numbers[i] + " ");
//			System.out.print(names[i] + " ");
//			System.out.println();
//
//		}

		/*
		 * Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a
		 * grade B (use 2 different ways of creating an array).
		 * 
		 */

		// 1st way
		char[] c = new char[6];
		c[0] = 'A';
		c[1] = 'B';
		c[2] = 'C';
		c[3] = 'D';
		c[4] = 'E';
		c[5] = 'F';

		// 2nd way
		char[] d = { 'A', 'B', 'C', 'D', 'E', 'F' };

		// int length = c.length;

		for (int i = 0; i < c.length; i++) {

			System.out.print(c[i] + ", ");

		}
		System.out.println();
		for (int i = 0; i < d.length; i++) {

			System.out.print(c[i] + ", ");

		}

	}

}
