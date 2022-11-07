package com.neotech.lesson22;

public class Homework2 {

//    Create a class with 3 overloaded static methods.
//    Then call each overloaded methods with specific arguments and observe the results

	static void play(String name) {

		System.out.println(name + " is playing heads or tails!");

	}

	static void play(String name, String name2) {

		System.out.println(name + " and " + name2 + " are playing chess!");
	}

	static void play(String name, String name2, String name3) {

		System.out.println(name + ", " + name2 + ", and " + name3 + " are playing Crazy Eights!");
	}

	public static void main(String[] args) {

		Homework2 p = new Homework2();

		p.play("Jim");
		p.play("Rich", "John");
		p.play("Joel", "James", "David");

	}

}
