package com.neotech.lesson19;

//Create a method that will accept a String as a parameter and return a new String that consist only of vowels. 

//Method should be available inside the class where it was declared and executed by calling it is name.

public class HomeWork2 {

	public static String vowels(String str) {

		String rtr = str.replaceAll("[^aeiou]", "");
		return rtr;

	}

	public static void main(String[] args) {

		String send = "Today is Saturday! How are you today guys?";
 
		System.out.println(HomeWork2.vowels(send));

	}

}
