package com.neotech.lesson17;

public class HomeWork2 {

	public static void main(String[] args) {

//		   	Write a program to print out the following conversion:
//			Today is Tuesday and we have a Java Class!!!  to 
//			yadoT si yadseuT dna ew evah a avaJ !!!ssalC.
//			You can use any other string as long as the format is correct.

		String str = "Today is Tuesday and we have a Java Class!!!";
		System.out.println(str);

		String[] str2 = str.split(" ");

		for (String row : str2) {
			for (int i = row.length() - 1; i >= 0; i--) {

				System.out.print(row.charAt(i));

			}
			System.out.print(" ");

		}

	}

}
