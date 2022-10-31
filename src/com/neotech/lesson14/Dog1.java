package com.neotech.lesson14;

public class Dog1 {
	
	
	
	/**
	 features: breed, size, color and age
    behaviors: eat(), run(), bark()
	 */
	
	
	String breed, size, color;
	int age;
	
	void eat() {
		
		System.out.println(breed + " is not eating too much"  );
		System.out.println(breed + " eats again");
		
	}
	
	void run() {
		
		System.out.println(breed +  " runs very well"  );
		
	}
	
	void bark() {
		
		System.out.println(breed + " barks loud!");
		
	}
	
	void age() {
		System.out.println(breed + "is " + age + "year old");
	}
	
	
	
	
	

}
