package com.neotech.lesson16;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {

//	    Write a program that reads two parent's first names and if they expecting boy or girl?
//	    Based on the input suggests a name for a baby:
//	    If it is a boy get half from dad and half from mom.
//	    If it is a girl get half from mom and half from dad.
//
//	        Example Output:
//	            Mom's first name? Mary
//	            Dad's first name? Daniel
//	            Boy or Girl? boy
//	            Suggested baby name: DANRY
//	        Example Output:
//	            Mom's first name? Mary
//	            Dad's first name? Daniel
//	            Boy or Girl? girl
//	            Suggested baby name: MAIEL

		Scanner scan = new Scanner(System.in);

		System.out.println("Mom's first name: ");
		String momFN = scan.next();

		System.out.println("Dad's first name: ");
		String dadFN = scan.next();

		System.out.println("Boy or Girl?");
		String boyOrGirl = scan.next();

		if (boyOrGirl.equalsIgnoreCase("Boy")) {

			System.out.println("Suggested baby name: " + dadFN.substring(0, dadFN.length() / 2)
					+ momFN.substring((momFN.length() / 2), momFN.length()).toUpperCase());
		}

		else if (boyOrGirl.equalsIgnoreCase("girl")) {

			System.out.println("Suggested baby name: " + (momFN.substring(0, momFN.length() / 2)
					+ dadFN.substring((dadFN.length() / 2), dadFN.length())).toUpperCase());
		} else {
			System.out.println("Invalid input!");
		}
	}
}
