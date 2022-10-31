package com.neotech.lesson14;

public class School {

	public static void main(String[] args) {

		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		
		
		s1.firstName = "Sedat";
		s1.lastName = "K";
		s1.gender = 'M';
		s1.grade = 'B';
		s1.studentID = 2;
		s1.school = "NeoTech";
		
		s1.doHomework();
		s1.study();
		
		System.out.println("===================");
		
		s2.firstName = "Murat";
		s2.lastName = "Tosun";
		s2.gender = 'M';
		s2.grade = 'A';
		s2.studentID = 5;
		s2.school = "NeoTech";
		
		s2.doHomework();
		s2.study();
		
		

	}

}
