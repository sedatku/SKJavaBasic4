package com.neotech.lesson17;

public class HomeWork01 {

	public static void main(String[] args) {
		// create a String that will hold a sentence. write a program to get a new
		//String without any spaces.
		 
		String str = "We are learning String Methods";
		
		String str2 = str.replace(" ", "");
		
		System.out.println("Old -> " + str + " length " + str.length());
		System.out.println("New -> " + str2+ " length " + str2.length());
		
	}

}
