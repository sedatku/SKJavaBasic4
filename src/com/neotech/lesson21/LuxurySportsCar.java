package com.neotech.lesson21;

public class LuxurySportsCar extends SportsCar {
	int speedMax = 180;
	int price = 100000;
	
	public LuxurySportsCar(){
		
	}
	
	public LuxurySportsCar(String make, String model, int speedMax ) {
		System.out.println(make + " " + model + " is a luxury sport car. " 
	+ "The car has " + doors + " doors, and has " + seats + " seats, and " 
	+ speedMax + " maximum speed." + "It is $" + price +".");
		
	}	

}
