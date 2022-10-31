package com.neotech.lesson06;

import java.util.Scanner;

public class HomeWork05 {

	public static void main(String[] args) {
		
		/*
		 * Create a Java program that will ask user to input city and temperature. Your
		 * program should convert Fahrenheit into celsius and print “The temperature is
		 * the city __ is __”
		 */
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Please enter your city : ");
		String city = input.next();
		
		System.out.println("Please enter temperature (F) : ");
		int fahrenheit = input.nextInt();
		
		//Convert C to F    C = 5/9(F-32)
		int celcilus = (fahrenheit -32)*5/9;
		
		System.out.println("The temperature is the " + city + " is " + celcilus + "C");


	}
	
	
	

}
