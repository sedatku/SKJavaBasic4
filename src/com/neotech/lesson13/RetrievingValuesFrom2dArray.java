package com.neotech.lesson13;

public class RetrievingValuesFrom2dArray {

	public static void main(String[] args) {

		String[][] months = { { "December", "January", "February" }, { "March", "April", "May" },
				{ "June", "July", "August" }, { "September", "Octaber", "November" }

		};
		// this shows us how many rows we have
		int rows = months.length;

		// this shows us how many columns we have in row 2
		int cols = months[1].length;

		System.out.println("Number of rows is " + rows + "and number of " + "colums for the 2nd element is " + cols);

		for (int row = 0; row < rows; row++) {
			// whats is months[0] ? --> {"Decmber", "January", "February"}

			for (int col = 0; col < cols; col++) {

				System.out.print(months[row][col] + " ");

			}

			System.out.println();
		}

		int[][] numbers = { { 3, 4, 6 }, { 5, 7, 3, 2, 6, 8, 4, 2 }, { 8 } };
		
		int rows_size = numbers.length;
		int col_size = numbers[0].length; //this is an issue
				
				
				
				for(int row =0; row <numbers.length; row++){
					
					for(int col = 0; col <numbers[row].length; col++){
						System.out.print(numbers[row][col] + " ");
						
					}
					System.out.println();
				}
				
				

	}

}
