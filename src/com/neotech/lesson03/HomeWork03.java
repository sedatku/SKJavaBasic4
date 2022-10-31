package com.neotech.lesson03;

public class HomeWork03 {

	public static void main(String[] args) {
		/**
		 * Write a Java program that will print a sum of two numbers Please use
		 * variables to store num1,num2,and sum Sample output: 46 + 90 = 136 ▪ 
		 * 
		 * Write a Java program to convert Fahrenheit to Celcius F=9*C/5+32 
		 * 
		 */
		
		double F = 86;
		double C = (F -32)*5/9;
		
		double Cal = 30;
		double Fah = (C * 1.8) + 32;
		
		System.out.println(F + " fahrenheit is = " + C + " celcius");
		System.out.println(Cal + " celcius is = " + Fah + " fahrenheit");
		
		
		
		/** 
		 * 
		 * ▪ Write a Java program that displays the area of a rectangle with a width of
		 * 4.5 and a height of 7.9 using the following formula: area = width * height 
		 * 
		 * 
		 */
		
		double w = 4.5;
		double h = 7.9;
		
		double a = w * h;
		
		System.out.println(w + " m width and " + h + " m height of a rectangle's area = " + a + " m.");
		
		
		
		/** 
		 * ▪ Write a Java program that calculates the average of 3 numbers. 
		 * 
		 * 
		 */
		
		double num1 =6;
		double num2 = 12;
		double num3 = 18;
		
		double avarage = (num1 + num2 + num3)/3;
		
		System.out.println(num1 + " , " + num2 + " , " + num3 + " avarages = " + avarage );
		
		
		/**
		 * Declare variable and increase by 100 using shorthand operator
		 */
		int i = 56;
		i+=100;
		System.out.println(i);
		
		/**
		 * Declare variable and decrease by 67 using shorthand operator
		 */
		int j = 267;
		j -=67;
		System.out.println(j);

		
	}

}
