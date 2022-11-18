package com.neotech.lesson26;

public class ShapeTest {

	public static void main(String[] args) {
		Circle c = new Circle();
		c.calculateArea(5);
		c.calculatePerimeter(5);
		
		Square s = new Square();
		s.calculateArea(6);
		s.calculatePerimeter(6);
	}
}