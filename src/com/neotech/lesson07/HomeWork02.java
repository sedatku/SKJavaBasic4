package com.neotech.lesson07;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {

		/*
		 * Using scanner class to create a calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user.
		 */
		
		Scanner scan = new Scanner (System.in);
		int result = 0;
		
		System.out.println("Please enter 2 numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("Please enter an operator (+, -, *, /)");
		char operator = scan.next().charAt(0);
		
		switch (operator) {
			case '+': 
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			default:
				System.out.println("Invalid value");
		
		}
		System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
		
	}

}
