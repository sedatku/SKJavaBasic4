package com.neotech.lesson07;

import java.util.Scanner;

public class RecapScanner {

	public static void main(String[] args) {
		
		//Data type name  assignment operator (=) values;
		//Scanner is a Java Class
		//Class  name = new Class name the new Scanner
		Scanner scanner = new Scanner (System.in);
		
		String text1, text2, text3;
		int age, year;
		double salary;
		boolean isRaining;
		char gender;
		
//		
//		//be careful:
//		
//		System.out.println("Enter a sentence: ");
//		text1 = scanner.next(); // read until you find a space and give back what you read
//		System.out.println(text1);
//		text2 = scanner.next(); 
//		System.out.println(text2);
//		text3 = scanner.nextLine(); //reads until the end of line
//		System.out.println(text3);
		
//		System.out.println("What is your age?");
//		age = scanner.nextInt();
//		System.out.println("Age: " + age);
//		System.out.println("What year is it?");
//		year = scanner.nextInt();
//		System.out.println("Year: " + year);
		
		/*
		 * System.out.println("Enter your salary: "); salary = scanner.nextDouble();
		 * 
		 * System.out.println("Your salary is: " + salary);
		 */
	
		/*
		 * System.out.println("Is it raining?"); isRaining = scanner.nextBoolean();
		 * System.out.println(isRaining);
		 */
		
		/*
		 * System.out.println("enter your gender (M or F): "); // gender =
		 * scanner.next().charAt(0);//method chaining //in two steps //1. read the word
		 * with next() //String str = scanner.next(); //2. get the char you need with
		 * charAt() //gender = stri.charAt(); String str = scanner.next(); gender =
		 * str.charAt(1); System.out.println(gender);
		 */
	
		System.out.println("Enter your name, city, age, gender, and salary");
		//Sabah, Plattsburgh, 30, Male, 150000
		text1 = scanner.next();
		text2 = scanner.next();
		age = scanner.nextInt();
		gender = scanner.next().charAt(0);//Because in java indexing starts at 0. male, 0 = M
		salary = scanner.nextDouble();
		
		
		System.out.println(text1 + " " + text2 + " " + age + " " + gender + " " + salary);
		
		
	
	
	
	
	
	
	}

}
