package com.neotech.lesson03;

public class HomeWork02 {

	public static void main(String[] args) {

		/**
		 * 2. Write a java program that converts mile to km and km to miles. Use scale 1
		 * mile = 1.609344.
		 */

		double km = 90;
		double mile = km / 1.609344;

		double m = 60;
		double kmeter = m * 1.609344;

		System.out.println(km + " km = " + mile + " miles.");

		System.out.println(m + " miles = " + kmeter + " km.");

	}

}
