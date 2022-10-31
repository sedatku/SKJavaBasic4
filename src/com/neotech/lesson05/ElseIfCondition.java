package com.neotech.lesson05;

public class ElseIfCondition {

	public static void main(String[] args) {

		double d1 = 15.5;
		double d2 = 15;
		
		//d1 > d2  --> same as saying that d2 < d1
		//d1 == d2 
		//d1 < d2
		
		if (d1 > d2) {
			System.out.println("Number " + d1 + " is larger than " + d2);
		}
		
		else if (d1 < d2) {
			
			System.out.println("Number " + d1 + " is smaller than " + d2);
			
		}
		
		
		else {
			System.out.println("Number " + d1 + " is equal to " + d2);
			
		}
		

	}

}
