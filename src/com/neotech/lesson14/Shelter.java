package com.neotech.lesson14;

public class Shelter {

	public static void main(String[] args) {
		//create object using the Dog class
		Dog1 dog1 = new Dog1();
		dog1.breed = "Bulldog";
		dog1.size = "Big";
		dog1.color = "Black";
		dog1.age =2;
		
		dog1.eat();
		dog1.run();
		dog1.bark();
		
		
		System.out.println("===========");
		
		Dog1 dog2 = new Dog1();
		dog2.breed = "Golden Rertiever";
		dog2.size = "Medium";
		dog2.color = "Golden";
		dog2.age =3;
		
		dog2.eat();
		dog2.run();
		dog2.bark();
		
		
		System.out.println("===========");
		
		Dog1 dog3 = new Dog1();
		dog3.breed = "Saint Bernard";
		dog3.size = "Big";
		dog3.color = "Mixed";
		dog3.age =1;
		
		dog3.eat();
		dog3.run();
		dog3.bark();
		dog3.age();
		
		

	}

}
