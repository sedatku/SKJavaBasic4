package com.neotech.lesson15;

import java.util.Scanner;

public class createEmail {
	/*
	 * Create a method createEmail(). Based on provided users firstName, lastName
	 * and emailType, your method should return complete email address. Example:
	 * firstName -> john lastName -> snow emailType -> gmail return ->
	 * johnsnow@gmail.com
	 */

	String createEmail(String firstName, String lastName, String emailType) {

		String emailAddress = firstName + lastName + "@" + emailType + ".com";

		return emailAddress;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter your name: ");
		String fistName = scan.next();
		System.out.println("Please enter your last name: ");
		String lastName = scan.next();
		System.out.println("Please enter your email type: (gmail/yahoo/hotmail)");
		String emailType = scan.next();

		createEmail obj = new createEmail();

		String emailAddress = obj.createEmail(fistName, lastName, emailType);
		System.out.println(emailAddress);

	}

}
