package com.neotech.lesson11;

public class IntroToArray {

	public static void main(String[] args) {

		// 1st way
		// data type identifier assignment op value
		int num = 5;

		// 2nd way
		// declare
		int num2;
		// initialize
		num2 = 5;

		// 1st way
		int[] array1 = new int[10];

		// 2nd way
		int[] array2;
		array2 = new int[8];

		// array1 [ ] [ ] [ ] [ ] [ ]

		// how do we store values in array?
		array1[0] = 10;
		// array1 [10] [ ] [ ] [ ] [ ]
		array1[1] = 15;
		// array1 [10] [ 15] [ ] [ ] [ ]
		array1[2] = 20;
		// array1 [10] [ 15] [20] [ ] [ ]
		array1[3] = 25;
		// array1 [10] [ 15] [20] [25] [ ]
		array1[4] = 30;
		// array1 [10] [ 15] [20] [25] [ 30]

		// reassigning
		array1[0] = 5;
		// array1 [5] [ 15] [20] [25] [30]

		// how do we access values?

		System.out.println(array1[2]);

		// Let's create a string array
		String[] strArray = new String[4];// create a string array named strArray with 4 elements

		strArray[0] = "New York";
		strArray[1] = "New Jersey";
		strArray[2] = "Colorado";
		strArray[3] = "Alabama";
		// strArray[4] = "Atlanta"; //our bounds 0-3 and 4 is out of that

		System.out.println("I live in " + strArray[0]);

		char[] letters = new char[6];
		letters[3] = 'C';
		letters[5] = 'A';
		letters[0] = 'B';
		letters[1] = 'X';

		System.out.println("The letter at index 5 is: " + letters[5]);

		letters[5] = 'Y'; // reassigning
		System.out.println("The letter at index 5 is: " + letters[5]);

	}

}
