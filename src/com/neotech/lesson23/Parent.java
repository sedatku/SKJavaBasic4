package com.neotech.lesson23;

public class Parent {

	Parent()
	{
		System.out.println("Parent class constructor");
	}
	
	void hello()
	{
		System.out.println("Hello from the parent class");
	}
	
	void bye() {
		System.out.println("Bye from the parent class");
	}
	
}


class Child extends Parent
{
	Child(){
		System.out.println("Child class constructor");
	}
	
	//if we changed it to private we are not overrriding, because we don't have access to the private methods of the parent class
	void hello()
	{
		System.out.println("Hello from the child class");
	}
	
	void bye() {
		System.out.println("Bye from the child class");
	}
	
}
