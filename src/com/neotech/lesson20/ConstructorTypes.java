package com.neotech.lesson20;

public class ConstructorTypes {
	
	
	
	String name;
	int age;
	
	//default constructor
	//no return type
	//same name as the class
	//no parameters
	ConstructorTypes(){
		System.out.println("I am a non-argument constructor");
		
	}
	
	
	
	//we can have parameters in constructors
	//signature: (String)
	ConstructorTypes(String str){
		System.out.println("I am a constructor with a string " + str);
		
	}
	
	//signature: (int)
	ConstructorTypes (int num)
	{
		System.out.println("I am a constructor with an int " + num);
	}
	
	//signature: double
	ConstructorTypes (double d){
		System.out.println("I am a constructor with a double " + d);
		
	}
	

	
	//signature: (String, int)
	ConstructorTypes(String str, int num){
		System.out.println("I am a constructor with String " + str + " and an int " + num);
	} 
	
	
	//signature: (String, String)
	ConstructorTypes(String str, String str2){
		System.out.println("I am a constructor with String " + str + " " + str2);
		
	}
	


	public static void main(String[] args) {
		ConstructorTypes ct = new ConstructorTypes();
		
		
		System.out.println(ct.name + " " + ct.age);
		
		                               //signature: (String)
		ConstructorTypes ct1 = new ConstructorTypes("Sabah");
		 								//signature:(String, int)
		ConstructorTypes ct2 = new ConstructorTypes ("Harun", 25);
		
		//Java will complain if you try to use a constructor that does not exist
		//ConstructorTypes ct3 = new ConstructorTypes ("Volkan", "Aykut" , "Mustafa");
		

	}

}
