package com.neotech.lesson09;

public class BreakAndContinue {

	public static void main(String[] args) {
	
		for (int i =1; i <=10; i++) {
			
			//when i becomes 5, break statement will execute
			//and get out of the loop
			if (i==5) {
			break;
			}
			System.out.print(i + " ");
			
		}
		
		System.out.println();
		
		for (int j =1; j <=10; j++) {
			
			//when i becomes 5, break statement will execute
			//and get out of the loop
			if (j==5) {
			continue;
			}
			System.out.print(j + " ");
			
		}
		
	
	}

}
