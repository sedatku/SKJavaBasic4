package com.neotech.lesson22;


//Create a class named CalculateArea in which you
//should create three methods (with the same name )that
//will calculate the area (volume) of
//- Rectangle - Square - Box
//Use a separate class to test your code

public class CalculateArea {
	
	//rectangle
	static void area (int side1, int side2) 
	{
		System.out.println( "The area of the Rectangle is --> " + side1 *side2 );
	}
	
	
	//square (double) -- no static
	void area (double side, double side2)
	{
		System.out.println( "The area of the Square is -->" + side * side2);
	}

	
	
	
	
	//square (int)
	static void area (int side)
	{
		System.out.println( "The area of the Square is -->" + side * side);
	}
	
	//

	
	
	
	
	//box - (int, int, int)
	static void area (int length, int width, int height)
	{
		System.out.println("This volume is --> " +  length * width * height);
	}
	
	

}
