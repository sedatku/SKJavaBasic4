package com.neotech.lesson02;

public class VariableValues {

	public static void main(String[] args) {

		/**
		 * Create a Java program and name it VariableValues In your program create
		 * variables to store all different types of primitive data. Print the value of
		 * each variable. Update value of each variable. Print the value of each
		 * variable after updating.
		 */

		byte byte02 = -15;
		short short02 = 32000;
		int int02 = 3000000;
		long long02 = 85658658999956L;
		float float02 = 233.343434F;
		double double02 = 3444343.44334;
		char char02 = '*';
		boolean boolean02 = false;

		System.out.println("byte: " + byte02);
		System.out.println("short:" + short02);
		System.out.println("int: " + int02);
		System.out.println("long: " + long02);
		System.out.println("float: " + float02);
		System.out.println("double: " + double02);
		System.out.println("char: " + char02);
		System.out.println("boolean: " + boolean02);

		byte02 = 15;
		short02 = 23433;
		int02 = 444444;
		long02 = 5000000000000L;
		float02 = 6666.6666F;
		double02 = 7777.77777;
		char02 = '&';
		boolean02 = true;

		System.out.println("//////////////////////////////////");

		System.out.println("The byte value is updated: " + byte02);
		System.out.println("The short value is updated: " + short02);
		System.out.println("The int value is updated: " + int02);
		System.out.println("The long value is updated: " + long02);
		System.out.println("The float value is updated: " + float02);
		System.out.println("The double value is updated: " + double02);
		System.out.println("The char value is updated: " + char02);
		System.out.println("The boolean is updated: " + boolean02);

	}

}
