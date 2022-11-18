package com.neotech.lesson23;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee emp = new Employee();
		emp.salary = 80000;
		emp.getPaid();
		
		System.out.println("------------");
		
		Contractor c = new Contractor();
		c.hourlyRate = 80;
		c.getPaid();
		
		System.out.println("------------");
		
		FulltimeEmployee f = new FulltimeEmployee();
		

	}

}
