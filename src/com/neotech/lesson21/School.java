package com.neotech.lesson21;

public class School {

	public static void main(String[] args) {
		
		//1st constructor is used
		Student st1 = new Student();
		st1.name = "John";
		st1.address = "Brown St. Ohio";
		st1.displayInfo();
		
		System.out.println("=======================");
		
		//2nd constructor is used
		Student st2 = new Student ("Jim", "12345 Street");
		st2.displayInfo();
		
		System.out.println("=======================");
		//3rd constructor is used
		
		Student st3 = new Student("Elmira");
		st3.displayInfo();

	}

}
