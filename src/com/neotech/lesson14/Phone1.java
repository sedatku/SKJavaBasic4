package com.neotech.lesson14;

public class Phone1 {
	
	/*
	 *   Create a Class "Phone". Create 3 Objects of it: iPhone, Android, Nokia with specific  attributes and behaviors.
	 */
	
	String brand, OSSystem, securityLevel, performance, batteryLife, price, multiMediaFunction;
	
	void pricePerformance() {
		System.out.println(brand + " is " + performance + " and has " +multiMediaFunction + " and "+ securityLevel + " phone." );
	}
	
	void Feature () {
		System.out.println(brand + " has " + OSSystem + " and " + batteryLife +  " phone." );
	}
		
	public static void main(String[] args) {
		
	Phone1 iphone = new Phone1();
	Phone1 Nokia = new Phone1();
	Phone1 Samsung = new Phone1 ();
	
	iphone.performance = "high level performance";
	Samsung.performance = "medium level  performance";
	Nokia.performance = "low level  performance";
	
	Nokia.batteryLife = "best level battery life ";
	iphone.batteryLife = "medium level battery life";
	Samsung.batteryLife = "worst level battery life";
	
	Samsung.multiMediaFunction = "best multi media function";
	iphone.multiMediaFunction = "medium multi media function";
	Nokia.multiMediaFunction = "worst multi media function";
	
	iphone.securityLevel = "high security level ";
	Samsung.securityLevel = "low security level";
	Nokia.securityLevel = "medium security level";
	
	iphone.OSSystem = "IOS";
	Nokia.OSSystem = "Windows";
	Nokia.OSSystem = "Android";
	
	iphone.brand = "Iphone 14";
	Samsung.brand = "Samsung Galaxy 20";
	Nokia.brand = "Nokia Lumia";
	
	
	iphone.pricePerformance();
	Samsung.pricePerformance();
	Nokia.pricePerformance();
	
	iphone.Feature();
	Samsung.Feature();
	Nokia.Feature();	

	}

}
