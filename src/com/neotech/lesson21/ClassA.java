package com.neotech.lesson21;

public class ClassA {
	// Human class

	String name = "Rich";
	public void eat(String name) {
		System.out.println(name + " loves eating.");

	}

	public void sleep(String name) {
		this.name = name;
		System.out.println(name + " doesn't sleep enough.");
	}

}
