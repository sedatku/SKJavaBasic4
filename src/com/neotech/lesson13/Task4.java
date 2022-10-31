package com.neotech.lesson13;

public class Task4 {

	public static void main(String[] args) {
/**

Create an array of cars : American,
German, Korean, Italian. Then
retrieve all values from that array
using 2 different loops


 * 
 */
		
		String [][] cars = {
				{"Ford", "Tesla", "Chevy"},
				{"MB", "BMW", "Audi"},
				{"Kia", "Hyundai"},
				{"Fiat", "Lambo", "Ferrari"}
			
		};
		
		
	
		//using indexed for loop
		for (int row =0; row<cars.length; row++) {
			for(int col = 0; col < cars[row].length; col++) {
				System.out.println(cars[row][col] + " ");
			}
			System.out.println();
		}

		
		System.out.println("=================================");
		//using enhanced for loop
		for (String[] row: cars) {
			for(String car: row) {
				System.out.println(car + " ");
				 
				
			}
			System.out.println();
		}
		
		System.out.println("=================================");
		//what if I want to print only American cars
		
		for (int us =0; us <cars[0].length; us++)
		{
			System.out.println(cars[0][us] + " ");
		}
		
		
	}

}
