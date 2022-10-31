package com.neotech.lesson11;

public class HomeWork04 {

	public static void main(String[] args) {

		/**
		 * 
		 * Homework 2: Create an array on integers and calculate the sum of all elements
		 * in an array.
		 * 
		 */

		int sum = 0;
		int[] array = { 35, 24, 77, 86, 95, 105, 109, 188 };

		for (int i = 0; i < array.length; i++) {

			sum += array[i];

		}

		System.out.println("Sum = " + sum);

	}

}
