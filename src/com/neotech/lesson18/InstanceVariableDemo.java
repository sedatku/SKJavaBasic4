package com.neotech.lesson18;

public class InstanceVariableDemo {

	public static void main(String[] args) {
		
		InstanceVariables obj = new InstanceVariables();
		
		System.out.println(obj.name);
		
		InstanceVariables obj2 = new InstanceVariables();
		obj2.name ="Sedat";
		
		
		System.out.println(obj2.name);
		
		System.out.println("----------------");
		System.out.println(obj.name);
		

	}

}
