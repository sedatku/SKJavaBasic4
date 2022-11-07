package com.neotech.lesson17;

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

		System.out.println("Please enter the fathers name: ");
		String fname = scan.next();

		System.out.println("Please enter the mothers name: ");
		String mname = scan.next();

		System.out.println("Are you expecting a boy or a girl?");
		String baby = scan.next();

		if (baby.equals("boy")) {
			// half from fname + half from mname

			String boyName = fname.substring(0, fname.length() / 2).concat(mname.substring(mname.length() / 2));

			System.out.println(boyName.toUpperCase());

		}

		else if (baby.equals("girl")) {

			String girlName = mname.substring(0, mname.length() / 2).concat(fname.substring(fname.length() / 2));
			// using concast
			// String girlName =
			// mname.substring(0,mname.length()/2).concat(fname.substring(fname.length()/2));
			System.out.println(girlName);

		} else {
			System.out.println("Wrong Entery!!!");
		}

	}

}
