package com.neotech.lesson02;

public class PrimitiveDataTypes {
	public static void main(String[] args) {
		
		//there 
		
		byte var1 = 9; // The range is -128 to 127 total of 256 different value

		// compiler will give an error
		// byte baris = 130;

		short hakan2 = 25; // range -32768 to 32767

		// compiler will give an error
		// short var4 = 35.6;

		int viktor = 23497234; // the range -2 billion to + 2 billion
		int esat = 3; // yes I can store small number in an int

		// if the number is bigger than 2billion we have to use long
		// if the number is bigger than 2billion we have to use L at the end
		long elionBankBalance = 92989898555565655L;

		System.out.println(elionBankBalance);

		// to store decimal numbers we use float or double

		float rahime = 23.456f; // you must us F or f at the end

		double rahime2 = 23.456; // you DON'T need F at the end

		System.out.println(rahime);
		System.out.println(rahime2);

		// to store a single character we use char
		char var3 = 'P';
		char var4 = '%';
		char var5 = 'p';
		char var6 = ' '; // this is the space character

		// compiler will give an error
		// char var7 = 'gg';

		char var8 = '2';

		// to store boolean values (true / false)
		boolean ali = true;

	}

}
