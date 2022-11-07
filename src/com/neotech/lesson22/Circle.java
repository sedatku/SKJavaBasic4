package com.neotech.lesson22;

public class Circle extends Shape {

	
	static double pie = 3.14;
	
	Circle(int radius) {
		super(radius);
		
		double circleArea =  pie * radius * radius; //pi*r*2

		System.out.println("Radius = " + radius + ", Area of the circle = " + circleArea);

	}
}
