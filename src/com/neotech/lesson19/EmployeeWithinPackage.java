package com.neotech.lesson19;

public class EmployeeWithinPackage {

	public static void main(String[] args) {
		
		Employee emp = new Employee();
		Employee.company = "NeoTech";
		emp.name = "Sabah";
		emp.LastName = "Bushaj"; //within package, we can access protected elements
		emp.salary = 124; //within package, we can access default elements

		//this is not visible
		//emp.ssn = 234;
		
		//this here does not exist
		//emp.phone = 343;
		
		//can we access methods
		emp.method1(); //public method, so we can access it
		emp.method2(); //protected method, so we can access it
		emp.method2(); //default method, so we can access it
		
		//this error says, it exists but you cannot access it from here
		//emp.method4();
		
		//this error says, it does not exist
		//emp.method5();
		
		
		

	}

}
