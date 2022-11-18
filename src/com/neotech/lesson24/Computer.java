package com.neotech.lesson24;

//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
//Define some common behavior (methods) and some fields in the parent class, and override some of the methods in the child classes.
//Define some methods specific to the child classes.
//Create objects of the child classes and store them in an array.
//Loop through each object and execute available methods.


public class Computer {
	String OSSystem;
	int price;
	int ram, hdd;

	public Computer(){
		
	}
	public Computer (int price, String OSSystem) {
		this.price = price;
		this.OSSystem = OSSystem; 
		
		System.out.println(price + " has " + OSSystem + " operation system.");
	}
	public Computer (int ram, int hdd) {
		this.ram = ram;
		this.hdd = hdd;
	}
	void hardware(int ram, int hdd) {
		this.ram = ram;
		this.hdd = hdd;	
	}
	void computerPrint(){
		System.out.println("Computer is an electronic device.");
	}
	void printInfo(String brand) {		
		System.out.println("A standard " + brand + " has " + ram 
				+ "gb memory and " + hdd + " gb hdd. It is $" + price + ".");
	}
}
