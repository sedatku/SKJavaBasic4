package com.neotech.lesson21;

public class Constructors {
	
	//1st
	public Constructors() {
		
		this(3);
		//this (2,4); // is not allowed, we can call just one
		
		
	}
	
	
	//2nd
	Constructors (int x){
		this(2,4);
	
		System.out.println("Hello 2nd constructor");
	}
	
	//3d
	Constructors (int x, int y){
		System.out.println("Hello 3rd constructor");
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
	//	Constructors obj1 = new Constructors (3, 5); //3rd constructor
	//	Constructors obj2 = new Constructors (4); // 2nd constructor
		Constructors obj3 = new Constructors (); // first constructor
	}
	

}
