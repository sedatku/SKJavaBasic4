package com.neotech.lesson07;

import java.util.Scanner;

public class HomeWork03 {

	public static void main(String[] args) {

//		Write a program that lets user to enter apple,dell,acer laptop
//		models;
//		If it is Apple show “Apple-no virus”
//		If it is Dell show “Tough one”
//		If it is Acer show “Cheap one”
//		Else “do not buy that one!”
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a laptop model: ");
		String laptop = scan.next();
		
		switch (laptop) {
		
		case "Apple":
			System.out.println("Apple no virus");
			break;
		case "Dell":
			System.out.println("Tough one!");
			break;
		case "Acer":
			System.out.println("Cheap one");
			break;
		default:
			System.out.println("Do not buy that one!");
		
		
		}
		
		

	}

}
