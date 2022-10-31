package com.neotech.lesson07;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {
		// Ask the user about their country and print the language
		//they speak
		
		Scanner scan = new Scanner (System.in);
		String country;
		System.out.println("Where are you from? ");
		country = scan.nextLine();
		
		//to compare string we use .equals
		//to compare strings and ignore case: .equalsIgnoreCase
//		if (country.equals("Albania"))
//		{
//		
//		System.out.println("You speak Albanian");
//		}
//		else if(country.equals("Turkey"))
//		{
//			System.out.println("You speak Turkish");
//		}
//		else if(country.equals("Ecuador")) {
//			System.out.println("You speak Spanish");
//		}
//		else if(country.equals("Moldova"))
//		{
//			System.out.println("You speak Romanian");
//		}
//		else if(country.equals("USA") ||country.equals("UK")) {
//			System.out.println("You speak English");
//		}
//		else {
//			System.out.println("I don't know what language you speak");
//		}
//		
//		

		switch(country) 
		{
		case "Turkey":
			System.out.println("You speak Turkish");
			break;
		case "Albenia":
		case "Kosovo":
			System.out.println("You speak Albanian");
			break;
		case "Spain":
		case "Ecuador":
			System.out.println("You speak Spanish");
			break;
		case "Moldova":
			System.out.println("You speak Romanian");
			break;
		case "USA":
		case "UK":
			System.out.println("You speak English");
			break;
		default: 
			System.out.println("I don't know what language you speak");
			break;
			
		}
		
		
		
	}

}
