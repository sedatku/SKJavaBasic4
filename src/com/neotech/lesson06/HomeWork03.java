package com.neotech.lesson06;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {
		
		
//		You are a loan specialist and you need to ask the user what is the amount of loan that is needed.
//	    If loan is less or equal to 200,000 then you would lend the money otherwise you would reject the client.
		
		Scanner input = new Scanner(System.in);
		System.out.println("How much do you need?");
		int loanAmount = input.nextInt();
		
		if (loanAmount >0 && loanAmount <=20000) {
			
			System.out.println("Congratulations!!! You will have the loan!!");
			
			
		}
		else {
			System.out.println("Sorry!!! You won't have the loan!");
		}
		
		
		

	}

}
