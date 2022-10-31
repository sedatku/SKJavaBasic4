package com.neotech.lesson16;

public class task02 {

	public static void main(String[] args) {
//		Create a String and if the String is not empty perform the following:
//		- if the String has an odd number of characters and has 3 or
//		more characters, print the character in the middle of the String.
//		
 
		
		String str = "Oktay";
		
		if(!str.isEmpty()) //if the String is not empty
		{
			int length = str.length();
			
			if(length%2==1 && length >=3 ) {
				//print the character in the middle of the string
				
				System.out.println(str.charAt(length/2)); //print the character in the middle
				
			}
			else//length is even or less than 3
			{
				System.out.println("Either the length is even or less than 3!!");
			}
		}
		else {
			System.out.println("Str is empthy");
		}
		
		
	}

}
