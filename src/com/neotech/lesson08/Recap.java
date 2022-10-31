package com.neotech.lesson08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		//Find the largest among 3 numbers
		
		//declaring there doubles
		double a, b, c;
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Enter three numbers: ");
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		//Using nested if
		
		//logic:
		//if a > b
		
		// if a > c
				// a is the largest
			// else it means c is larger than a --> c is the largest
		//else -- meaning a < b
			//if b > c 
				//b is the largest
			// else --> meaning c > b
			// --> c is the largest
		
//		if (a > b) {
//			if (a > c) {
//				System.out.println(a + " is the largest number!");
//				
//			}
//			else //a < c
//			{
//				System.out.println( c + " is the largest number!");
//			}
//		}
//		
//		else // a < b
//		
//		{
//			if (b > c){ // b > a and b > c
//			
//			System.out.println( b + " is the largest number!");
//			}
//			else //b < c
//				{
//				System.out.println(c + " is the largest number! ");
//				
//				}
//			
//		}
		
		
		System.out.println("=== using comparison operators ===");
		
		if (a > b && a > c) {
			System.out.println(a + " is the largest number!");
		}
		
		else if (b > a && b > c) {
			System.out.println(a + " is the largest number!");
			
		}
		else // c is the largest
			{
			System.out.println(c + " is the largest number!");
			}

	}

}
