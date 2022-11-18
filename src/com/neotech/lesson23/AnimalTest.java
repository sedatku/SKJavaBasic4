package com.neotech.lesson23;

public class AnimalTest {

	public static void main(String[] args) {

		Animal obj1 = new Animal();
		//these are available methods to Animal class
		obj1.eat();
		obj1.sleep();
		
		Tiger obj2 = new Tiger();
		obj2.eat();
		obj2.run();
		obj2.sleep();
		
		//primitive casting
		//casting
		int i =3;
		double d =i;
		
		
		System.out.println("=============");
		//non primitive casting --> up casting /widening
		//this is a two part sentence
						//create a Tiger object
		//assign it to Animal object
		Animal obj3 = new Tiger();	
		obj3.eat();
		obj3.sleep();
		//obj3.run(); // compile error --> because the method run() is not defined in Animal Class
		
		//we are casting a Tiger object, as an Animal object 
		// so, we see all methods that are in Animal class
		// but when we override a method in the Tiger class, that takes priority on RUNTIME
		
		
		
		//can we do downcasting - can an parent get in the clothes of a child
		//Down casting is not done like this:
		//Tiger obj4 new Animal();
		
		Tiger obj4 = (Tiger) obj3;
		obj4.run();
		
		// also, we can do down-casting this way but it is not safe
		
		Tiger obj5 = (Tiger) new Animal();
		

	}

}
