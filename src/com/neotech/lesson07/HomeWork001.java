package com.neotech.lesson07;

import java.util.Scanner;

public class HomeWork001 {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade and then provide explanation:A-Excellent, B-Good,
		 * C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
		 * should print which grade was entered by a user with explanation.
		 */
		Scanner scan = new Scanner (System.in);
		String result =""; 
		
		System.out.println("Please enter your grade: ");
		char grade = scan.next().charAt(0);
		
		
		switch(grade) {
			case 'A': 
				result = "Excellent";
				break;
			case 'B':
				result = "Good";
				break;
			case 'C':
				result = "Average";
				break;
			case 'D':
				result = "Bad";
				break;
		default:
			result = "Not Acceptable";
			
		}
		System.out.println("Your grade is " + grade + " = " + result );
		
		
	}

}
