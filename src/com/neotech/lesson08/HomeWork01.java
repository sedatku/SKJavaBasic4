package com.neotech.lesson08;

public class HomeWork01 {

	public static void main(String[] args) {
		
		/**
		 *  Write a program using while loop that calculates the sum of the even numbers between 0 and 10.
		 */
		
		int i =0;
		int sum = 0;
		
		while (i<=10) {
			if(i%2==0) {
				System.out.print(i + " ");
				sum = sum +i;
				
			}
			
			i++;
			
			
		}
		
		System.out.println();
		System.out.println("Total: " + sum);
		

	}

}
