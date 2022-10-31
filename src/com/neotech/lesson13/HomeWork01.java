package com.neotech.lesson13;

public class HomeWork01 {

	public static void main(String[] args) {
		/**
		 *
		 * Create an array of countries: north America countries, south America
		 * countries, Europe countries, Asian countries, African countries. Then print
		 * all values from that array using 2 different loops and calculate how many
		 * total countries been stored.
		 */
		int sum=0;
		int sum2 =0;
		String[][] countries = {
				{ "Canada", "Mexico", "The USA", "Costa Rica", "Cuba", "El Salvador", "Haiti", "Panama" }, // NorthAmerica
				{ "Brazil", "Argentina", "Bolivia", "Chile", "Ecuador", "Peru", "Uruguay", "Venezuela" }, // SouthAmericaCountries,
				{ "Germany", "France", "Bulgaria", "Albania", "Italy", "Norway", "Finland", "Denmark" }, // EuropeCountries
				{ "Kazakhstan", "Georgia", "Iraq", "Idia", "Azerbaijan", "Uzbekistan", "Tajikistan", "Yemen" }, // AsianCountries,
				{ "Libya", "Algeria", "Morocco", "Angola", "Niger", "Kenya", "Ghana", "Mali" } // AfricanCountries,
	};
		// using indexed for loop
		for (int row = 0; row < countries.length; row++) {
			for (int col = 0; col < countries[row].length; col++) {

				System.out.print(countries[row][col] + " ");
				sum++; 
			}
			System.out.println();
		}
		System.out.println("Total countries: " + sum);
		
		System.out.println("================================");
		
		// using enhanced for loop

		for (String[] row : countries) {

			for (String country : row) {
				System.out.print(country + " ");
				sum2++;
			}
			System.out.println();
		}
		System.out.println("Total countries: " + sum2);
	}
}
