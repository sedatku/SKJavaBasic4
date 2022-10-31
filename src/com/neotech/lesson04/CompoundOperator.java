package com.neotech.lesson04;

public class CompoundOperator {

	public static void main(String[] args) {

		// Also know as (aka) shorthand operator
		int num = 100; // store 100 into a container

		num = num + 100;// adding 100 to the value inside the container
		System.out.println(num);

		// we can use compound/shorthand operator
		num += 60; // add 60 to the container
		System.out.println(num);

		// long way
		num = num - 10;
		// short way
		num -= 10;

		// long way
		num = num / 7;
		// short way
		num /= 7;

		num = num * 2;
		num *= 2;

		num = num % 9;
		num %= 9;
		
		

	}

}
