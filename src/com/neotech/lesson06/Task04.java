package com.neotech.lesson06;

public class Task04 {

	public static void main(String[] args) {
		/**
		 * Write a java program to check if a patient has allergies. If the patient does
		 * not have allergies print “You’re healthy!”. If the patient has allergies,
		 * check if it is a peanut allergy, lactose allergy, bee allergy or seafood
		 * allergy and print a statement telling the patient “Don’t eat ___”. (fill the
		 * line with the food names – peanut, seafood etc.)
		 */

		boolean allergies = false;
		boolean peanut = false;
		boolean lactose = true;
		boolean bee = true;
		boolean seafood = false;

		if (allergies) {

			if (peanut) {
				System.out.println("Don't eat peanut");

			} else {
				System.out.println("You can eat peanut ");
			}

			if (lactose) {
				System.out.println("Don't drink milk");

			} else {
				System.out.println("You can drink milk");
			}

			if (bee) {
				System.out.println("Don't eat honey");

			} else {
				System.out.println("You can eat honey");
			}

			if (seafood) {
				System.out.println("Don't eat seafood");

			} else {
				System.out.println("You can eat seafood");
			}

		} else {
			System.out.println("You're healthy!");
		}

	}

}
