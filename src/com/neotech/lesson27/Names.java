package com.neotech.lesson27;

import java.util.ArrayList;

public class Names {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("John");
		names.add("Rich");
		names.add("Lisa");
		names.add("Pam");
		names.add("Jim");
		
		System.out.println("The array list empty?: " + names.isEmpty());
		System.out.println("THe array contains: \"Jim\"? : "+ names.contains("Jim"));
		
		System.out.println("The array size: " + names.size());
		System.out.println(names);
		
		for (String el: names) {
			System.out.println(el);
		}

	}

}
