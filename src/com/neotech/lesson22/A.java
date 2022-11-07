package com.neotech.lesson22;


//Write program for multilevel inheritance where 
//class A is inherited by B and class B is inherited by class by C.


public class A {
	
	//this. --> it access elements within the class
	//super. --> it accesses elements on the parent class
	
	String name = "A";
	
	void method()
	{
		System.out.println("This a method in class A");
		System.out.println(this.name);
	}

}

class B extends A 
{
	String name = "B";
	
	void method() {
		System.out.println("This a method in class B");
		System.out.println(this.name);
		System.out.println(super.name);
		
		super.method();
		
		
	}
	
}


class C extends B{
	String name = "C";
	
	void method()
	{
		System.out.println("This a method in class C");
		System.out.println(this.name);
		System.out.println(super.name);
		super.method();
	
	}
	
	
	
}


