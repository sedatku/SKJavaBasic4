package com.neotech.lesson17;

public class StringImmutable {

	public static void main(String[] args) {
	
		String str = "Hello";
		str.concat("World!");
		
		System.out.println(str);
		
		str.toUpperCase();
		System.out.println(str);
		
		//reassigning but not changing
		
		//str --> was pointing to some string "Hello"
		// str = str + "ALL"; --> new str is pointing to this new string
		
		str = str.concat(" World!");
		System.out.println(str);
		
		
		
		
		String str2 = "Hello";  // actually pointing to the one created earlier
		
		
		
		
		
		
		

	}

}
