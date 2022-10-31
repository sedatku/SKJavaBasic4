package com.neotech.lesson06;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// Import Scanner Class

		// declare a Scanner variable
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name: ");

		// declare a variable to catch the user input

		String name = input.next();

		// write name on the screen
		System.out.println("Nice to meet you: " + name);
		System.out.println();

		// declare an integer to catch the users age
		System.out.println("Please enter your age: ");
		int age = input.nextInt();
		System.out.println("Your age is: " + age);

		// declare a double to catch the users age
		System.out.println("Plase enter your weight: ");
		double weight = input.nextDouble();
		System.out.println("Your weight: " + weight);
		
		
		System.out.println("Do you think it is going to rain today? (true/false");
		boolean willRain =input.nextBoolean();
		//System.out.println(" You thing it is going to rain: " + willRain);
		
		if(willRain) {
			System.out.println("Bring your umbrella with you!");
		}
		else {
			System.out.println("Enjoy the weather!");
		}

	}

}
