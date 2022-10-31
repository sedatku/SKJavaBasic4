package com.neotech.lesson04;

public class Recap {

	public static void main(String[] args) {

		// Declaring and assigning a value to a variable
		String str = "Good morning";
		System.out.println(str);

		// re-assigning a value to the previously declared variable
		str = "Good afternoon";
		System.out.println(str);

		// order of aritchmetic operations
		int num1 = 5 + 5 + 5;
		System.out.println(num1);

		int num2 = 5 + 5 * 5;
		System.out.println(num2);
		
		int num3 = (5 + 5) * 5;
		System.out.println(num3);

		int num4 = 5 * 5 + 5 / 5;
		System.out.println(num4);
		
		int sadik = 8/2*(2+2);
		System.out.println(sadik);
		
		System.out.println("------------");
		
		int number1 = 15;
		int number2 = 4;
		double  div = number1 / number2; //3.75
		
		System.out.println(div);
		
		int rem4 = 347562878 %5;
		
		System.out.println(rem4);
		
		System.out.println("------------");
		
		System.out.println("Addition or Concatenation");
		
		int a = 10;
		int b = 20;
		String x = "Java";
		String y = "sunday";
		boolean z = true;
		System.out.println(x + " " + y + " " + z);
		
		System.out.println("Java" + 10 + 5);//Java105
		System.out.println("Java" + (10 + 5));//Java15
		System.out.println(a + b + x);//30Java
		System.out.println(""+a+b+x+y);//1020JavaSunday
		System.out.println(a + (b + x) + y);//1020JavaSunday
		
		System.out.println("------------");
		System.out.println(x + y + a + b);//JavaSunday1020
		System.out.println(x + y + a * b);//JavaSunday200
		
		System.out.println("rahime" + 3 +3); //rahime33
		System.out.println("rahime" + 3 *3); //rahime9
		
		System.out.println("------------");
		
		char c2 = ' '; //space is a character
		//char c1 = ''; //comple error
		
		String emptyStr = ""; //is a String, zero characters inside
		String spaceStr = " "; //is a string, one characters inside, the space
		
		
		
	}

}
