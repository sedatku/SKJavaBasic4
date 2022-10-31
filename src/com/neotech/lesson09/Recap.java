package com.neotech.lesson09;

public class Recap {

	public static void main(String[] args) {
		
		for (int i = 1; i <=5; i++ )
		System.out.println("Good Evening");
		
		
		//what do we need when use a While
		//- we are responsible for where, we start
		//-we are responsible when we stop
		
		System.out.println("------------");
		int count= 1;
		while (count <=5) {
			count++;
			System.out.println("Good Evening");
		}
		System.out.println("------------");
		int count2= 1;
		
		do{
			System.out.println("Good Evening");
			
			count2++;
		}
		while (count2 <=5);
		
		
		
		

	
	}
}
