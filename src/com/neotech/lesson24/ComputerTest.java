package com.neotech.lesson24;

public class ComputerTest {

	public static void main(String[] args) {
		Apple a = new Apple();
		a.hardware(8, 2);
		a.cost(1000);
		a.operationSystem("MacOS");
		a.printInfo("Macbook Pro");
 
		Lenovo l = new Lenovo();
		l.hardware(4, 1); 
		l.price = 700;
		l.printInfo("Lenovo");
 
 
		HP hp = new HP();
		hp.hardware(4, 1);
		hp.price = 650;
		hp.printInfo("HP");
 
		Dell d = new Dell();
		d.price = 550;
		d.hardware(4, 1);
		d.printInfo("Dell");
 
		System.out.println("==================");
		
		Computer[] arr = {a, l, hp, d};
		for(Computer element: arr) {
			element.computerPrint();
		}

	}
}
