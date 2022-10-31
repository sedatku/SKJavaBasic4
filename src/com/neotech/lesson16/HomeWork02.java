package com.neotech.lesson16;

public class HomeWork02 {
	
//    Create a String that should be combination of letters, numbers and special characters. 
//    Find out how many alpha characters are there in the String. (alpha characters means letters)

	public static void main(String[] args) {

		int strAlpha = 0;
		String str = "34$H$%e6l76898l@o W)o-34r546l76d1234!";

		System.out.println(str.replaceAll("[^a-zA-Z]", ""));
		strAlpha = str.replaceAll("[^a-zA-Z]", "").length();

		System.out.println("Alpha characters are " + strAlpha + " of total " + str.length() + " characters.");

	}

}
