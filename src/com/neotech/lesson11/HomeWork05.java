package com.neotech.lesson11;

public class HomeWork05 {

	public static void main(String[] args) {
		/**
		 * 
		 * 
		 * Homework 3: Create an array of countries. While retrieving all values from an
		 * array print capital for each country.
		 * 
		 */

		String[] countries = { "USA", "France", "Kazakhstan", "Turkey", "Germany" };
		String[] capital = { "Washington DC", "Paris", "Astana", "Ankara", "Berlin" };

		for (int i = 0; i < countries.length; i++) {

			System.out.print(countries[i] + " = " + capital[i]);
			System.out.println();
		}

	}

}
