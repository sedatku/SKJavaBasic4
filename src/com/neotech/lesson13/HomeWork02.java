package com.neotech.lesson13;

public class HomeWork02 {

	public static void main(String[] args) {

		// Write a java program to find the second largest number in the array? Maximum
		// and minimum number in the array?

		int[] numbers = { 1, 88, 56, -18, 78, 152, 919 };
		int min = numbers[0];
		int max = numbers[0];
		int secondLargest = numbers[0];

		for (int i = 1; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];

			} else if (numbers[i] < min) {

				min = numbers[i];
			}
		}

		for (int number : numbers) {
			if (number > secondLargest && number < max) {
				secondLargest = number;

			}

		}

		System.out.println("Max Number = " + max);
		System.out.println("Min Number = " + min);
		System.out.println("Second Largest Number= " + secondLargest);

	}

}
