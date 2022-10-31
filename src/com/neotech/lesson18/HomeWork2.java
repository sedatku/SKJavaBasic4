package com.neotech.lesson18;

public class HomeWork2 {

//   	Write a program to print out the following conversion:
//	Today is Tuesday and we have a Java Class!!!  to 
//	yadoT si yadseuT dna ew evah a avaJ !!!ssalC.
//	You can use any other string as long as the format is correct.

	public static void main(String[] args) {
		String str = "Today is Tuesday and we have a Java Class!!!";

		// I will do this in two steps
		// 1. Split the long string into words
		// 2. Reverse every word

		String[] strArray = str.split(" ");

		HomeWork2 hw2 = new HomeWork2();

		for (String word : strArray) {
			//1st way
			String reversedWord = hw2.reverseString(word);
			System.out.print(reversedWord + " ");
			

			
			//2nd way
//			StringBuffer sb = new StringBuffer(word);
//			System.out.print(sb.reverse() + " ");
//			
			
		}

	}

	String reverseString(String input) {
		String reversed = "";
		char[] letters = input.toCharArray();
		for (int i = input.length() - 1; i >= 0; i--) {
			reversed += letters[i];

		}
		return reversed;
	}

}
