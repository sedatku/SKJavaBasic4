package com.neotech.lesson09;

import java.util.Scanner;

public class HomeWork04 {

	public static void main(String[] args) {
		/**
		 * Write a program to ask a user to enter item they want to buy and the price of
		 * that item. Every time user enters money accumulate the amount and tell the
		 * user how much is left to pay off. If user give more money program should
		 * return a change. Whenever a user done with payments program should say "Thank
		 * you for shopping!"
		 */
		String item;
		int itemPrice;
		int itemPayment;
		int totalPayment;

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter item for buying: ");
		item = scan.next();
		System.out.println("Please enter the price of item: ");
		itemPrice = scan.nextInt();
		System.out.println("Please enter your payment: ");
		itemPayment = scan.nextInt();

		totalPayment = itemPayment;

		System.out.println("Remaining balance: " + (itemPrice - totalPayment));

		for (int i = totalPayment; i < itemPrice; i++) {

			if (totalPayment < itemPrice) {
				System.out.println("Do you want to any payment?");
				itemPayment = scan.nextInt();
				totalPayment = totalPayment + itemPayment;
				System.out.println("Remaining balance: " + (itemPrice - totalPayment));

			}

		}

		System.out.println("Thank you for shopping!");

	}

}
