package com.neotech.lesson07;

public class LogicalNOT {

	public static void main(String[] args) {
		// ! (NOT) - reserves the value of a boolean variable

		boolean b1 = !true;
		System.out.println(b1);

		boolean b2 = !false;
		System.out.println(b2);
		
		//not only in front a boolean variables, 
		//it can work with any boolean expression
		
		int x = 0;
		//we can write it like this
		if (x != 12) //x is not equal to 12
		
		{
			System.out.println("x is NOT 12");
		}

	}

}
