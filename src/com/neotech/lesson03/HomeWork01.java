package com.neotech.lesson03;

public class HomeWork01 {

	public static void main(String[] args) {

		/**
		 * 1. Write a java program to display the area and perimeter of a circle that
		 * has a radius of 5. Use pi = 3.
		 */

		int r = 5;
		int pi = 3;

		int area, perimeter;
		area = pi * r * r;
		perimeter = 2 * pi * r;

		System.out.println("Area of the circle = " + area);
		System.out.println("Perimeter of the circle = " + perimeter);

	}

}
