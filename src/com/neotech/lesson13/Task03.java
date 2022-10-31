package com.neotech.lesson13;

public class Task03 {

	public static void main(String[] args) {
		
		/**
		 
		 Create a 2D array or integer type and store numbers inn 3 rows and 3 columns
		 print the sum of all numbers
		 
		 
		 */
		
		int [][] numbers = {
				{5, 1, 2},
				{4, 5, 2},
				{9, 8, 7}
		};
		int sum =0;
		
		for(int[]row : numbers) {
			
			for(int number: row) {
				sum += number;
	
				
			}
			
		}
		
		System.out.println("Total: " + sum);
		
		
	}

}
