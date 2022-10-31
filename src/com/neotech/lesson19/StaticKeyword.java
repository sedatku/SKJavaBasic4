package com.neotech.lesson19;

public class StaticKeyword {
	
	
	//instance variables
	String color; //default
	int memory;
	
	
	//static variables
	static String brand;
	static boolean touchscreen;
	
	//not static - it is instance method 
	//inside an instance method we can use every variables
	void displaySpecificInfo()
	{
		System.out.println("We built a " + brand + " with " + memory + " GB with " + color + " color!");
		
	}
	
	
	//inside static methods we cannot reference instance variables
	//we can only use static variables
	
	static void displaySpecificInfo_2 () 
	{
	// System.out.println("We built a " + brand + " with " + memory + " GB with " + color + " color!");
		
	System.out.println("Brand is " + brand + " and the touchscreen is " + touchscreen);
	
	
	}
	

	
	public static void main(String[] args) {
		
		//this is a local variable, we have to distinguish from other variables
		//String touchscreen;
		
		
		//we do not have to create an object for static variables
		StaticKeyword.brand = "Iphone";
		//we are in the same class, so we can access touchscreen without the class name
		StaticKeyword.touchscreen = true;
		
		//can we say this?
		//StaticKeyword.color = "red";  //obj needed
		
		StaticKeyword iphone1 = new StaticKeyword();
		
		iphone1.memory = 64;
		iphone1.color = "red";
		
		iphone1.displaySpecificInfo();
		
		//can we call it without object name? Yes, because we are in the same class
		StaticKeyword.displaySpecificInfo_2();
		
		//we can but this is not right
		iphone1.displaySpecificInfo_2();
		
		//we can do this? but it is not right way to change a static variable
		iphone1.touchscreen = false;
		
		//the correct way is:
		StaticKeyword.touchscreen = true;
		
		//why sometimes we are using class name for static element and sometimes not
		//to show that we can do it from within the same class
		
		displaySpecificInfo_2();
		
		
		
	}
	


}
