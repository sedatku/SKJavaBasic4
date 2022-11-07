package com.neotech.lesson20;

public class Student {

	// Write program as a Student class that has instance variables name and address. 
	//Create a constructor that will initialize those variables. 
	//Print name & address of given student using displayInfo method.
	
	String name;
	String address;

	Student() {
		System.out.println("Non-argument constructor");
	}

	Student(String name, String address) {
		this.name = name;
		this.address = address;
	}

	void displayInfo() {
		System.out.println("Student name: " + this.name + ", Address: " + this.address + ".");
	}

	public static void main(String[] args) {
		
		Student st1 = new Student();
		
		st1.name = "Hakan";
		st1.address = "123 Brodway St. Nj, 23565";
		st1.displayInfo();
		
		Student st2 = new Student("Haci" , "2345 Apple St. FL, 6542");
		st2.displayInfo();
		
	}

}
