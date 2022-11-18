package com.neotech.lesson23;

public class StudentTest {

	public static void main(String[] args) {


		Student s1 = new Student();
		s1.studentInfo(88, "John", "Brown");
		s1.printMsg();
		
		NeotechStudent n1 = new NeotechStudent();
		n1.printMsg();
		n1.studentInfo(25,"Jim"	,"Ern");
		
		CollegeStudent cs = new CollegeStudent();
		cs.collegeRequarment();
		cs.printMsg();
		
		SchoolStudent ss = new SchoolStudent();
		ss.printMsg();
		
	}

}
