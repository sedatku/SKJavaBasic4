package com.neotech.lesson04;

public class Task {

	public static void main(String[] args) {
		//create a int variable named number1, assign the value of 500;
		
		
		int number1 = 500;
		byte number2 = (byte) number1; //narrowing, manually
		
		number1 = number2;
		
		System.out.println(number2);
		
		int num1 = 50;
		byte num2 = (byte) num1;
		num1 = num2;
		
		System.out.println(num2);
		

	}

}
