package com.neotech.lesson21;

//Write a Java program called Car. Specify features and behaviours of the Car class.
//Create SportsCar and FamilyCar subclasses of the Car class with 
//their own features and behaviours.
//Next, create a LuxurySportsCar that will inherit the SportsCar and 
//also will have its own features and behaviours.
//Create objects from each class and test them.

public class Car {
	String make;
	String model;
	int doors = 4;
	int seats =5;
	int speedMax = 80;
	
	public static void main(String[] args) {
		
		FamilyCar fc = new FamilyCar("Toyota", "Sierra", 65);
		SportsCar sc = new SportsCar("Mazda", "MX-5");
		LuxurySportsCar lsc = new LuxurySportsCar("Chevrolet", "Corvette", 194 );
		
	}
}




