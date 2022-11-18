package com.neotech.lesson25;

public class VehicleTest {
	
	public static void main(String[] args) {
		
		//Not possible to instantiate
		//Vehicle v = new Vehicle ("Red");
		
		Vehicle v1 = new Tesla ("Red", "Tesla"); //up-casting
		v1.start();
		v1.stop();
		v1.drive();
		v1.brake();
		
		//display() does not exist in Vehicle class
		//v1.display();
		
		
		System.out.println("==============");
		
		Toyota toyota1 = new Toyota("Black", "Camry");
		Vehicle toyota2 = new Toyota("Grey", "Rav4");
		
		//OBAMA, yes we can
		toyota1.start();
		toyota2.start();
		
		System.out.println("==============");
		Tesla tesla1 = new Tesla("Red", "Model S");
		Vehicle tesla2 = new Tesla("Yellow", "Model 3");
				
		tesla1.display();
		
		//TRUMP, no we can't
		//tesla2.display();
		
		Tesla tesla3 = (Tesla) tesla2;
		tesla3.display();
		

//		Apple a2 = (Apple) f; // down-casting
//		a2.peel();
//		a2.wash();
		
	}
	
	

}
