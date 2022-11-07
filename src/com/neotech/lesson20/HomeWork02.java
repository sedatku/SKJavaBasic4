package com.neotech.lesson20;

	// Homework 2:
	// Write a program that will have 4 different access levels of constructors 
	// and create 3 objects of this class: 
	// 1 -inside same class; 2 -from outside the class; 3 -from different class inside different package and observe result.


public class HomeWork02 {
	
	String message;
	
	HomeWork02() //default constructor
	{
		System.out.println("Brown High School");
		System.out.println("default constructor");
	}
	
	public HomeWork02(String name){
		
		System.out.print(name + " is a student");
		System.out.print(" --> public constructor <-- from different package");
	}
	
	
	private HomeWork02(String name, int num){
		
		System.out.print(name + " has " + num + " school number");
		System.out.print("--> private constructor <-- inside the class");
	}
	
	
	protected HomeWork02(String name, int num, String grade){
		
		System.out.print(name + " has " + num + " school number " + grade + " grade" );
		System.out.print("-->  protected constructor <-- outside the class");
	}
	
	public static void main(String[] args) {
		
		HomeWork02 st1 = new HomeWork02("Ali", 125);

	}
	
}
