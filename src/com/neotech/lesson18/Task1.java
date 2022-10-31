package com.neotech.lesson18;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Create a Class called Employee:
//			 Create three variables: eID, salary and set the CEO to “Elion”
//			CEO should be a static variable
//			Create a method printInfo() that prints out the eID, salary and
//			CEO of the object
//			 Create two objects of the class Employee
//			Set the value of eID, salary for each of the objects
//			:black_small_square: Call the printInfo() method for both objects
//			:black_small_square: Change the CEO to “Ahmet”
//			:black_small_square: Call the printInfo() method for both objects
		
		
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		emp1.eID = 333;
		emp2.eID = 444;
		emp1.salary = 555555;
		emp2.salary = 6666666;
		
		emp1.printInfor();
		emp2.printInfor();
		
		emp1.CEO = "Ahmet";
		emp1.printInfor();
		emp2.printInfor();
		

	}

}
