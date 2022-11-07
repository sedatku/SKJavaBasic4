package com.neotech.lesson21;

//Write a Java program called Teacher. 

//Specify features and
//behaviour of the Teacher class. Create 3 subclasses
//MathTeacher, ChemistryTeacher and PianoTeacher that will
//also have their own features and behaviour. Test all 4
//classes

public class Teacher {
	String fullName;
	char gender;
	String major;
	int age;
	
	public void teaches() {
		System.out.println(fullName + " is a teacher");
	    System.out.println(fullName + " s major is " + major);
	}

//	public static void main(String[] args) {
//
//		MathTeacher m = new MathTeacher("Rich", "Math", 45);
//
//		ChemistryTeacher c = new ChemistryTeacher("Jim", "Chemistry", 45);
//		
//		PianoTeacher p = new PianoTeacher("John", "Piano", 45);
//		
//
//	}

}
