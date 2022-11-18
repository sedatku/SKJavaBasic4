package com.neotech.lesson23;



public class TestShape {

	public static void main(String[] args) {
		Shape s = new Shape(5);
		//s.calculateArea(); parents do not inherit from children
		
		Circle c = new Circle(5);
		c.calculateArea();
		
		Circle c2 = new Circle(6);
		c2.calculateArea();
		
		Circle c3 = new Circle(8);
		c3.calculateArea();
		
		

	}

}
