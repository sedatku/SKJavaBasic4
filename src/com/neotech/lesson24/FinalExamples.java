package com.neotech.lesson24;

public class FinalExamples {
//	1. Create a class FinalExamples that has one final String variable 
// with an initial value and one final method printVariable().
//	In the main method create an object of FinalExamples class and try to reassign a value to instance variable.
//	Create a sub class of FinalExamples named ChildClass and try to override the printVariable() method.

	final String schoolName = "NeoTech";

	final void printValiable() {
		System.out.println(schoolName + " is teaching QA.");

	}

	public static void main(String[] args) {

		FinalExamples fe = new FinalExamples();
		fe.printValiable();
	}
}

class ChildClass extends FinalExamples {
//	void printValiable() {
//		
//
//	}
	//Can I do this? Yes, just another method
	void printVariable (String name) {
		
	}

}