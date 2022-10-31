package com.neotech.lesson16;

public class StringMoreMethods {

	public static void main(String[] args) {
		
		//charAt()
		
//		Scanner scan = new Scanner(System.in);
//		char letter = scan.next().charAt(1);
//		
//		System.out.println(letter);
		
		 
		String name = "Mehpare";
		char letter = name.charAt(0);
		
		System.out.println("letter: " + letter);
		
		
		//indexOf()
		
		int index = name.indexOf('e');
		
		System.out.println("Index of e is: " + index);
		
		String name1 = "Burak";
		System.out.println("Index of u is " + name1.indexOf('u'));
		
		System.out.println("Index of ak is " + name1.indexOf("ak"));
		
		//subString()
		String message = "Today is a very good day!";
		//message.substring(0);
		System.out.println(message.substring(5)); //only one parameter, beginIndex
		
		String substr2 = message.substring(6, 19);
		System.out.println(substr2);
		

	}

}
