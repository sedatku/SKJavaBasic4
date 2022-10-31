package com.neotech.lesson12;

public class Task3 {

	public static void main(String[] args) {
		// Create an array of countries.
		// While retrieving all values from an array print capital for each country.
		// (use 2 different loops).

		String[] countries = { "TURKEY", "USA", "UK" };

//		for (String country : countries) {
//
//			for (String capital : capitals) {
//				if (capital.indexOf(capitals) == country.indexOf(country)) {
//					System.out.println("The capital of " + country + " is " + capital);
//				} else {
//					continue;
//				}
//
//			}
//
//		}

		// using for loop
		for (int i = 0; i < countries.length; i++) {
			String country = countries[i];
			if (country.equals("TURKEY")) {
				System.out.println("Ankara");
			} else if (country.equals("USA")) {
				System.out.println("Washington DC");
			} else if (country.equals("UK")) {
				System.out.println("London");
			} else {
				System.out.println("No country");
			}

		}

		System.out.println("------------");

		// using for-each loop

		for (String country : countries) {
			if (country.equals("TURKEY")) {
				System.out.println("Ankara");
			} else if (country.equals("USA")) {
				System.out.println("Washington DC");
			} else if (country.equals("UK")) {
				System.out.println("London");
			} else {
				System.out.println("No country");
			}

		}

	}

}
