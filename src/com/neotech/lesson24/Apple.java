package com.neotech.lesson24;

public class Apple extends Computer{
	
	@Override 
	void computerPrint(){
		System.out.println("Macbook Pro is a best computer.");
	}
	void cost(int price) {
		super.price = price;
	}
	void operationSystem(String OSSystem) {
		System.out.println("Macbook has " + OSSystem + " operation system.");
	}
	
}
