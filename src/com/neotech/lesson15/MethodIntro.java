package com.neotech.lesson15;

public class MethodIntro {
	
	//does not return anything    // name     // no parameters (input)
	void greet()
	{//begin body of method
		System.out.println("Hello");
		System.out.println("How are you?");
		System.out.println("Bye!");
		

	}//end body of method
	
	void greet2(String name) 
	{
		System.out.println("Hello " + name);
		System.out.println("How are you?");
		System.out.println("Bye " + name);
	} 
	
	
	 
	
	
	

	public static void main(String[] args) {
		
		//calling a method ---> executing a method ---> running the code of a mothod
		
		MethodIntro obj = new MethodIntro();
		
		obj.greet();
		obj.greet2("Ali"); //we are passing a string
		obj.greet2(""); // vs obj.greet2();
		
		String name = "Vane";
		obj.greet2(name);
		
		
		
	}

}
