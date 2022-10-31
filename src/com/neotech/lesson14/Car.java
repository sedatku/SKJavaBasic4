package com.neotech.lesson14;

public class Car {
	// what features does a car have
	/**
	 * make model color year mileage maxSpeed
	 * 
	 */

	// what behaviors does a car have?

	/*
	 * drive() stop() transportPeople()
	 */

	// how can we create features:

	String make;
	String model;
	String color;
	int year;
	int mileage;
	int maxSpeed;

	// how do we create our behaviors:
	// return type methodName()
	// {
	// your code goes in here
	// }

	void drive() {
		System.out.println(make + " " + model + " drives!");
	}

	void stop() {
		System.out.println(make + " stops!");
	}

	void transportPeople() {
		System.out.println(make + " can transport people!");
	}

	public static void main(String[] args) {
		// how do we create an object from blueprint/template
		int a = 5; // this lives within our main method
		int b;

		Car car1 = new Car(); // Car class --- car1 object
		// what does line do?
		// 1. declaring an object of class Car
		// 2. instantiation (new)
		// 3. Car () -- initialization

		car1.make = "Toyota";
		car1.model = "Camry";
		car1.color = "Red";
		car1.year = 2019;
		car1.mileage = 25000;
		car1.maxSpeed = 220;
		
		
		System.out.println(car1.make + " ");
		
		car1.drive();
		car1.stop();
		car1.transportPeople();

	}

}
