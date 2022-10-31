package com.neotech.lesson18;

public class Students {
	
	
	
//	Create a Class called Students 
//	▪ Create three variables studentName, studentID and numberOfStudents (should be a static variable)
//	▪ Create three objects of the Students Class
//	▪ Set the value for studentName, studentID and increment
//	the numberOfStudents for each object
//	▪ Print out total the number of students
//	

	static String studentName;
	static int StudentID;
	static int numberOfStudents = 0;

	void printStudentInfo() {

		System.out.println("Student name: " + studentName + " Student ID: " + StudentID + " Number of students: "
				+ numberOfStudents);
	}

	public static void main(String[] args) {

		Students st1 = new Students();
		Students st2 = new Students();
		Students st3 = new Students();

		st1.studentName = "Abdulrezzak";
		st1.StudentID = 88;
		Students.numberOfStudents++;
		st1.printStudentInfo();

		st2.studentName = "Haci";
		st2.StudentID = 745;
		Students.numberOfStudents++;
		st2.printStudentInfo();

		st3.studentName = "Murti";
		st3.StudentID = 2491;
		Students.numberOfStudents++;
		st3.printStudentInfo();
		
		System.out.println("Number of Students: " + numberOfStudents);

	}

}
