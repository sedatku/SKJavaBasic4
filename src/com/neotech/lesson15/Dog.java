package com.neotech.lesson15;

public class Dog {

	/*
	 * Create a Dog Class and create 3 different objects of it: Husky, Bulldog,
	 * Labrador with specific attributes and behaviors.
	 * 
	 */

	int age;
	String breed;
	

	void eat() {
		System.out.println(breed + " eats too much");

	}

	void bark() {
		System.out.println(breed + " barks a lot!");
	}

	void age() {
		System.out.println(breed + " is very young dog!");
	}

	public static void main(String[] args) {

		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();

		dog1.breed = "Husky";
		dog2.breed = "Bulldog";
		dog3.breed = "Labrador";

		dog1.age = 1;
		dog2.age = 4;
		dog3.age = 7;

		dog1.age();
		dog2.eat();
		dog3.bark();

	}

}
