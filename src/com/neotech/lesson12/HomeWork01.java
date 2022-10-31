package com.neotech.lesson12;

public class HomeWork01 {

	public static void main(String[] args) {
		/*
		 * 1. Create a 2D array where you will store the following values: - Mr, Mrs,
		 * Ms, Miss - Smith, Jordan, Jackson, Obama.
		 * 
		 * After storing values print the following: Mrs Smith, Mr Obama, Ms Jackson,
		 * Miss Jordan.
		 * 
		 * Be careful because they are mixed.
		 */
		String[][] people = { 
				{ "Mr", "Mrs", "Ms", "Miss" }, 
				{ "Smith", "Jordan", "Jackson", "Obama" }

		};

		System.out.print(people[0][1] + " " + people[1][0] + ", ");
		System.out.print(people[0][0] + " " + people[1][3] + ", ");
		System.out.print(people[0][2] + " " + people[1][2] + ", ");
		System.out.print(people[0][3] + " " + people[1][1] + ".");

	}

}
