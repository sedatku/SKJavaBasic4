package com.neotech.lesson08;

import java.util.Scanner;

public class HomeWork02 {

	public static void main(String[] args) {
		/**
		 * Write a program that asks user to enter his/her username and password until
		 * user enters them correctly
		 */

		Scanner scan = new Scanner(System.in);
		String userName = "Hello";
		String password = "Word";
		String user = "";
		String userPass = "";
		boolean bool = true;

		System.out.println("Please enter user name: ");
		user = scan.next();

		System.out.println("Please enter the password: ");
		userPass = scan.next();

		while (bool) {
			if (user.equals(userName) && userPass.equals(password)) {
				System.out.println("Welcome to system lol");
				bool = false;

			} else {
				System.out.println("Please enter user name: ");
				user = scan.next();

				System.out.println("Please enter the password: ");
				userPass = scan.next();
			}
		}
	}
}
