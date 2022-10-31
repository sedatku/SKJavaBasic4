package com.neotech.lesson15;

import java.util.Scanner;

public class getGrade {

	/*
	 * Your method should accept the score of a student and return a grade: score >
	 * 90 - A score > 80 - B score > 70 - C score > 50 - D anything else - F
	 */

	char getGrade(int score) {
		char grade;

		if (score > 90) {
			grade = 'A';
		} else if (score <= 90 && score > 80) {
			grade = 'B';
		} else if (score <= 80 && score > 70) {
			grade = 'C';
		} else if (score <= 70 && score > 50) {
			grade = 'D';
		} else {
			grade = 'F';
		}

		return grade;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your score");
		int score = scan.nextInt();

		getGrade obj = new getGrade();

		char grade = obj.getGrade(score);

		System.out.println("Your grade is: " + grade);

	}

}
