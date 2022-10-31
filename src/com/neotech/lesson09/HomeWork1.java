package com.neotech.lesson09;

public class HomeWork1 {

	public static void main(String[] args) {
		
		//1. write a program using while loop
		//that calculates the sum of the even numbers between 0 and 10
		
		//create a logic that whatever the number I give you is, you will print all next
		//even numbers until 5000
		
		//0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
		
		//how do I write a while going from 1 to 10
		int i = 0;
		int sum = 0;
		
		while (i <=10) {
			//now check if the current number is odd or even
			
			if(i%2==0) {
				System.out.print(" i: " + i);
				
				sum +=i;
				
			}
			
			
			i++;

		}
		
		System.out.print(" Sum: " + sum);
		
		
		
		// a = 1;
		// a = a+5;
		// a +=5;
		// increment a++ (add 1 too 1)
		
		
		//2nd way -increment by 2
		//0, 2, 4, 6, 8, 10
		int j = 0;
		int total =0;
		while (j<=10) {
			total +=j;
			j +=2;
			
		}
		System.out.println("total: " + total);
		
		
		
		
		
	}

}
