package com.neotech.lesson09;

import java.util.Scanner;

public class DoWhileTask {

	public static void main(String[] args) {
		// Ask a user: Guess the number
		//Lucky number is 5
		//As long as the entered number is not 5 we need keep ask for trying
		//Once number is correct --> "You are winner"
		
		int luckyNumber = 5;
		
		Scanner scan = new Scanner (System.in);
		
		int number;
		
//		System.out.println("Please guess my number: ");
//		number = scan.nextInt();
//		
//		System.out.println("Your number: " + number);
//		
//		while (number!=luckyNumber) {
//			System.out.println("Please guess my number: ");
//			number = scan.nextInt();
//			
//		}
//		System.out.println("You are winner");
		
		
		//using do while
		
		
		do {
			System.out.println("Guess my number: ");
			number = scan.nextInt();
		}
		while(number != luckyNumber);
		
		System.out.println("You are a winner");

	}

	
	//using for loop --- I want to give the user max 5 tries
//	
//	for(int i = 1; i<=5; i++) {
//		System.out.println("Guess my number: ");
//		number = scan.nextInt();
//		
//		if (number == luckyNumber) {
//			System.out.println("You are a winner");
//			break;
//		}
		
		
	}
	
	

