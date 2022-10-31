package com.neotech.lesson08;

public class IntroToWhiteLoop {

	public static void main(String[] args) {
	
		int time = 8;
		
		
		if (time <9) {//begin of if body
			System.out.println("Good evening");
			
		}//ending of if body
		
		while (time < 12) 
		{//beginning of while body
			System.out.println(time);
			time++;
			
		}//ending of while body
		
		
		//How to print number [20 - 30 [?
		
		int a = 20;
		while (a <30) 
		{
			
			//print number in one line
			System.out.print(a + " " );
	//		System.out.println(a);
			a++;
			
		}
		
		
		System.out.println("");
		
		// how do we print numbers 5 to 25;
		
		int b = 5;
		while (b <=25) {
			System.out.print(b++ + " ");
			
			//increment
			//b++;
		}
		
		System.out.println("");
		int c = 10;
		while (c>=1) {
			
			System.out.print( c + " ");
			//--c or c -- only matter is we are doing multiple operations in one line
			c--;
		}
		
		//how can I print even numbers from 50 to 1?
		System.out.println("");
		
		int d = 50;
		
		while (d >1) {
			
			if (d %2==0 ) {
			
			System.out.print(d + " ");
			}
			d--;
		}
		

	}

}
