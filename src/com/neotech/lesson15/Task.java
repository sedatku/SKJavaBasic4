package com.neotech.lesson15;
/**
 * 	/**
	 * method1: Create a method that will take 2 parameters as numbers
		and prints which number is larger.
		
	method2: Create a method that will take a number and prints whether
		the number is even or odd.
		
	method3: Create a method that will say Hello in a different language
	based on the country that will passed when method is executed.

	 */




public class Task {
	
	
	
	//minimalistic method:
	//1. return type (void)
	//2. in this case, two int parameters
	//3. name
	
	void larger (int a, int b) 
	{
		if (a>b) {
			System.out.println(a + " is larger than " + b);
		}
		else if(b>a) {
			System.out.println(b + " is larger than " + a);
		}
		else{
			System.out.println("Numbers are equals");
		}
	}
	
	
	void evenOrOdd (int num) 
	{
		if(num %2==0) {
			System.out.println(num + " is even!");
		}
		else {
			System.out.println(num + "is odd!");
		}
		
	}
	
	void sayHello(String country) 
	{
		switch(country)
		{
		case "US":
			System.out.println("Hello");
			break;
		
		case "Turkey":
			System.out.println("Merhaba");
			break;
		case "Albania":
			System.out.println("Ckemi!");
			break;
		case "Ecuador":
			System.out.println("Hola");
			break;
		default:
			System.out.println("I don't know how should say hello");
		
		}
			
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		Task t = new Task();
		
		t.larger(6, 2);
		
		t.evenOrOdd(8);
		
		t.sayHello("Turkey");
	}

}
