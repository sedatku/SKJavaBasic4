package com.neotech.lesson23;

public class ParentChildTest {

	public static void main(String[] args) {
		Parent p = new Parent();
		p.hello();
		p.bye();
		
		System.out.println("====================");
		Child c = new Child();
		c.hello();
		c.bye();

	}

}
