package com.neotech.lesson04;

public class HomeWork {

	public static void main(String[] args) {
		//km to mile
		//use scale 1 mile = 1.609344
		
		
		double mile, km, scale; //declaring 3 variables
		
		scale = 1.609344;
		mile = 10;
		km = mile * scale;
		
		System.out.println(mile + " mile is " + km + "  kilometers");
		
		double km2 = 10;
		double mile2 = km2 / scale;
		
		System.out.println(km2 + " kilometers is " + mile2 + "miles");
		

	}

}
