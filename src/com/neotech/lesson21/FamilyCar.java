package com.neotech.lesson21;
public class FamilyCar extends Car {
	int seats = 7; 
	FamilyCar() {
	}
	 FamilyCar(String make, String model, int speedMax) {
		// this.seats = seats;
		System.out.println(make + " " + model + " is a family car. " 
	+ "The car has " + doors + " doors, and has " + seats + " seats. The car has " 
				+ speedMax + " m/h maximum speed.");	
	}	
}
