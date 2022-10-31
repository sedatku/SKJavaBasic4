package com.neotech.lesson19;

public class HomeworkDemo {

	public static void main(String[] args) {
		
		HomeWork st1 = new HomeWork();
		st1.studentName = "Oktay";
		st1.studentID = 1;
		
		HomeWork.numberOfStudents++;
		
		//we can do this, but don't this is not the proper way
		//st1.numberofStudents++;
		
		HomeWork st2 = new HomeWork();
		st2.studentName = "Hakan";
		st2.studentID = 2;
		
		HomeWork.numberOfStudents++;
		
		
		HomeWork st3 = new HomeWork();
		st3.studentName = "Harun";
		st3.studentID = 3;
		
		HomeWork.numberOfStudents++;
		
		System.out.println("The total number of numbers is: " + HomeWork.numberOfStudents );
		
		

	}

}
