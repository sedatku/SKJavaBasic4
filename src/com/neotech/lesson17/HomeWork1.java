package com.neotech.lesson17;

public class HomeWork1 {

	public static void main(String[] args) {

//		Homework 1:
//		    Create a String and print it in reverse order (Sunday → yadnuS). 
//		    Solve it using charAt(), toCharArray()  and reverse() methods.
//		    Note:
//		        for charAt() and toCharArray() use String
//		        for reverse you have to declare a StringBuffer object
//		

//		Create a String and print it in reverse order (Sunday → yadnuS). 
//		it using charAt(),

		String str = "Sunday";
		String strTotal = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			strTotal += str.charAt(i);
		}
		System.out.print(strTotal);

		System.out.println("");

//		toCharArray()

		char[] strChar = str.toCharArray();

		for (int j = strChar.length - 1; j >= 0; j--) {

			System.out.print(strChar[j]);
		}
		
		System.out.println("");

//		reverse() methods

		StringBuffer reversStr = new StringBuffer(str);
		System.out.print(reversStr.reverse());

	}

}
