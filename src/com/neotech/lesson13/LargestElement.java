package com.neotech.lesson13;

public class LargestElement {

	public static void main(String[] args) {
		int[] numbers = { 45, 34, 87, 33, 15, 92, -13, 55 };
		int largest = numbers[0];

		// 1st way

		for (int i = 1; i < numbers.length; i++) {

			// compare the current largest number with the new number that the loop give use

			if (largest < numbers[i]); {
				largest = numbers[i];
			}

		}

		System.out.println("The largest number is: " + largest);
	}

}
