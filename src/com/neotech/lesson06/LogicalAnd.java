package com.neotech.lesson06;

public class LogicalAnd {

	public static void main(String[] args) {
		//Declare a number
		//if number is between 1-10 --> number is small
		// if number is between 11-100 --> number is medium
		// if number is between 101 - 1000 --> number is large
		
		// declare a number
		int number =50;
		
		//check if the number is between 1 and 10
		
		if (number >=1 && number <=10) {// check if the number is between 11 and 100
			System.out.println(" number is small "); 
		}
		else if (number >=11 && number <=100){  
			System.out.println(" number is medium ");
		}
		else if (number >100 && number <=1000) {
			System.out.println(" number is large ");
		}
		else {
			System.out.println(number + " is out of range");
			
		}
		

	}

}
