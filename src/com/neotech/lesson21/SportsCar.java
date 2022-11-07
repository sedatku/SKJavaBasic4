package com.neotech.lesson21;

public class SportsCar extends Car{

	int doors =2;
	int speedMax = 120;
	int seats = 2;
	int price = 40000;
	public SportsCar(){		
	}
	public SportsCar(String make, String model) {
		System.out.println(make + " " + model + " is a sport car." 
	+ " The car has " + doors + " doors, and has "  + seats + " seats."
	+ " The car has " + speedMax + " m/h maximum speed." 
	+ "It is $" + price +"." );
	}
}
