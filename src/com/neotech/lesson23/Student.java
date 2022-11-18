package com.neotech.lesson23;
//Create a Class Student that will have 3 subclasses as NeotechStudent, CollegeStudent, SchoolStudent.
//Define common behavior within the parent class and override some of the methods in the child classes
//Define some methods specific to the child classes
//Write an example of achieving run time polymorphism

public class Student {
	String fName, lName;
	int sNo;
	
	void studentInfo(int sNo, String fName, String lName) {	
		System.out.println("Student No: " + sNo + " Student Name: " 
	+ fName + " Last Name: " + lName);	
	}
	void printMsg() {
		System.out.println("English Class is mandatory for all students.");
	}
}

class NeotechStudent extends Student{
	void printMsg() {
		System.out.println("NeoTech: Best QA school");
	}
}

class CollegeStudent extends Student{
	void collegeRequarment(){
		System.out.println("You need to take the SAT exam before applying to college.");
	}
	void printMsg() {
		System.out.println("Federal student loans best option for college studends.");
	}
}

class SchoolStudent extends Student{
	void printMsg() {
		System.out.println("The students have to complate all homeworks!");
	}
}




