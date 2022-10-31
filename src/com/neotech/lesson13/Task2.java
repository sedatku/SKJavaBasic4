package com.neotech.lesson13;

public class Task2 {

	public static void main(String[] args) {
	/**
		 Create a 2D array or integer type where you will store odd and even numbers in 3
	rows and 4 columns. Develop a program which will identify/print the even
	numbers only.
	  
	  
	 */
		
		int[][] numbers = {
				{1, 2, 6, 7},
				{8, 9, 15, 17 },
				{11, 15, 12, 45}
				
		};
		
		for(int[] row : numbers){
			for(int number: row) {
				if(number%2==0){
					System.out.print(number + " ");
				}
				
			}
		
		}
		

	}

}
