package com.neotech.lesson12;

public class HomeWork02 {

	public static void main(String[] args) {
		/*
		 * 2. Create a 2D array that first row will contain 4 names and second row will
		 * contain grades, all Strings. Then you program should print name of the
		 * students that has A and B grade
		 */

		String[][] nameGrades = new String[2][4];
		// 1st row
		nameGrades[0][0] = "James";
		nameGrades[0][1] = "Rich";
		nameGrades[0][2] = "Lisa";
		nameGrades[0][3] = "Pablo";
		// 2nd row
		nameGrades[1][0] = "D";
		nameGrades[1][1] = "C";
		nameGrades[1][2] = "B";
		nameGrades[1][3] = "A";

		int arrayLenght = nameGrades[1].length;

		for (int i = 0; i < arrayLenght; i++) {

			if (nameGrades[1][i].equals("A") || nameGrades[1][i].equals("B")) {
				System.out.println(nameGrades[0][i] + " has grade " + nameGrades[1][i]);
			}

		}

	}

}
