package com.neotech.lesson19_1;

//this imports only class Employee from package com.neotech.lesson19
import com.neotech.lesson19.Employee;

//this imports all the classes Employee from package com.neotech.lesson19
//import com.neotech.lesson19.*;


public class EmployeeOutsidePackage {

	public static void main(String[] args) {


		Employee emp = new Employee();
		
		Employee.company = "Neotech"; //if we want to access it here, t has to be public
		
		emp.name = "Mustafa"; //we can access because this is public
		//emp.lastName = "Kilic"; // this is protected, so we cannot access outside package
		
		//emp.salary = 1234; //salary is default so we cannot access from out of package
		//emp.ssn = 2333; //off course, private is not visible
		
		//Can we access the methods:
		
		
		
		emp.method1(); //we can access because this is public
		//for all of these you need to make them public to be able to call them here
		//emp.method2(); 
		//emp.method3();
		//emp.method4();
		
		//emp.method5(); //this is totally a different issue
		

	}

}
