package com.neotech.lesson02;

public class DeclareVariables {

	public static void main(String[] args) {

		/*
		 * Create a Java Program (class) and name it DeclareVariables. Create variables
		 * for all 8 primitive Data Types (byte, short, int, long, float, double, char,
		 * boolean). I want you to print out each variable on a separate line and test
		 * its number range (capacity).
		 * 
		 */

		byte byte01 = 8; // byte value: -128 --> 127
		short short01 = 32760; // short value: -32768 -->32767
		int int01 = 5000000; // int value: -2147483648 --> 2147483647 (-2billion --> 2billion)
		long long01 = 87598987565L; // long value: more than 2billion and add 'L' at the end
		float float01 = 345454.6565F; // use for decimal numbers and add 'F' at the end
		double double01 = 34354333.3443; // use for decimal numbers. no need to add F at the end
		char char01 = 'C'; // use for single character
		boolean boolean01 = true; // use for true or false values;

		System.out.println("byte value: " + byte01);
		System.out.println("short value: " + short01);
		System.out.println("int value: " + int01);
		System.out.println("long value: " + long01);
		System.out.println("float value: " + float01); //
		System.out.println("double value: " + double01);
		System.out.println("char value: " + char01);
		System.out.println("boolean value: " + boolean01);

	}

}
