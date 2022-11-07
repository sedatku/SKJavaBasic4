package com.neotech.lesson21;

// Write program for multilevel inheritance where 
//class A is inherited by B and class B is inherited by class by C.

public class ClassABC {

	public static void main(String[] args) {
		
		ClassA a = new ClassA();
		a.eat("Jim");

		ClassB b = new ClassB();
		b.teacher(b.name, "math", "High School");
		b.sleep("John");
		
		ClassC c = new ClassC();
		c.name = "Joel";
		c.student(c.name, 5, c.school);
		
		
		
		
		

		
		
		
		
		
		
		

		

	}

}
