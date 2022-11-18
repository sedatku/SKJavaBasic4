
package com.neotech.lesson25;


public class PhoneTest {

	public static void main(String[] args) {
		// we cannot instantiate abstract classes
		// we cannot create objects abstract classes
		// Phone p = new Phone();
		// p. takePicture();
		
		Phone iphone = new iPhone(); //upcasting
		
		iphone.call();
		iphone.text();
		iphone.takePicture();
		iphone.playMusic();
		
		
		
		Phone iphone3 = new iPhone(); //upcasting
		iphone3.call();
		iphone3.text();
		iphone3.takePicture();
		iphone3.playMusic();
		
		System.out.println("===============");
		
		Phone samsung = new Samsung();
		samsung.call();
		samsung.text();
		samsung.takePicture();
		samsung.playMusic();
		
		//Error. No googlePlay() method in Phone class
		//samsung.googlePlay();
		
		
	}
	
	
	
	
}
