package com.neotech.lesson18;

public class HomeWork1 {
	// create a string and print it in reverse order (Sunday -> yadnuS)
	// Solve it using charAt(), toCharArray() and reverse() methods

	// Note:
	// for charAt() and toCharArray() use String
	// for reverse you have to declare a StringBuffer object

	public static void main(String[] args) {

		String str = "Sunday";

		// 1st way, using the charAt();
		// System.out.println(str.charAt(0));

		for (int i = str.length() - 1; i >= 0; i--) {
			char c = str.charAt(i);
			System.out.print(c);

		}
		System.out.println();

		// 2nd way, using toCharArray();
		char[] charArray = str.toCharArray();
		for(int i = str.length()-1; i>=0; i--) {
			char c = charArray[i];
			System.out.print(c);
			
		}
		System.out.println();
		
		
		//3rd way, using reverse() method of StringBuffer
		StringBuffer strBuffer = new StringBuffer(str);
		strBuffer.reverse();
		System.out.println(strBuffer);
		
		
		//4th way, using reverse() method of StringBuilder
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.reverse();
		System.out.println(strBuilder);
		
		// String is immutable, calling the toUpperCase() method
		str.toUpperCase();
		System.out.println(str);
		
		String strUpper = str.toUpperCase();
		
		System.out.println(strUpper);
		
		
	}

}
