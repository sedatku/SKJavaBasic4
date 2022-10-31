package com.neotech.lesson15;

public class Task01 {
	
	/**
	 * method1: Create a method that will take 2 parameters as numbers
		and prints which number is larger.
method2: Create a method that will take a number and prints whether
		the number is even or odd.
method3: Create a method that will say Hello in a different language
	based on the country that will passed when method is executed.

	 */
	
	void larger (int a, int b) 
	{
		if(a > b) {
			System.out.println(a + " is larger");
		}
		else if (b>a) {
			System.out.println(b + " is larger");
		}

	}
	
	void evenOrOdd (int a) {
		
		if(a%2==0) {
			System.out.println(a + " is even number");
		}
		else {
			System.out.println(a + " is odd number");
		}
		
	}

	void hello(String country) {

		if (country.equals("Turkey")) {
			System.out.println("Merhaba");
		} else if (country.equals("USA")) {
			
			System.out.println("Hello");
				}
			else if(country.equals("Spain"))	
				System.out.println("Hola");
			else {
				System.out.println("");
			}

	}
	
	
	public static void main(String[] args) {
		
		
		Task01 obj = new Task01();
		
		obj.larger(5, 3);
		obj.evenOrOdd(9);
		obj.hello("Turkey");
	}
	
	
	
	
	

}
