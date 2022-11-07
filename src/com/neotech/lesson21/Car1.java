package com.neotech.lesson21;

	class FamilyCar1 extends Car1 {
	int seats = 7;

	FamilyCar1() {
	}

	FamilyCar1(String make, String model, int speedMax) {
		System.out.println(make + " " + model + " is a family car. " + "The car has " + doors + " doors, and has "
				+ seats + " seats, and " + speedMax + " maximum speed.");
	}

}

	class SportsCar1 extends Car1 {

	int doors = 2;
	int speedMax = 120;
	int seats = 2;

	public SportsCar1() {

	}

	public SportsCar1(String make, String model) {
		System.out.println(make + " " + model + " is a sport car." + "The car has " + doors + " doors, and has " + seats
				+ " seats and " + speedMax + "maximum speed.");
	}

}

	class LuxurySportsCar1 extends SportsCar1 {
	int speedMax = 180;
	int price = 100000;

	public LuxurySportsCar1() {
	}

	public LuxurySportsCar1(String make, String model, int speedMax) {
		System.out.println(make + " " + model + " is a family car. " + "The car has " + doors + " doors, and has "
				+ seats + " seats, and " + speedMax + " maximum speed.");
	}
}

	public class Car1 {
	String make;
	String model;
	int doors = 4;
	int seats = 4;
	int speedMax = 80;

	public static void main(String[] args) {

	}

	FamilyCar1 fc = new FamilyCar1();
	SportsCar1 sc = new SportsCar1();
//	LuxurySportsCar lsc = LuxurySportsCar();

}
