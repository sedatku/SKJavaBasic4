package com.neotech.lesson15;

public class PhoneStore {
 
	public static void main(String[] args) {

		//famous formula
		//data type  name =  value;
		  Phone iphone = new Phone();
		  iphone.brand = "Apple";
		  iphone.color = "Red";
		  iphone.price = 2000;
		  
		  iphone.call();
		  iphone.text();
		  iphone.navigate();
		  
		  
		  Phone android = new Phone();
		  android.brand = "Samsung";
		  android.color = "Black";
		  android.model = "Note 10";
		  android.price = 500;
		  
		  android.call();
		  android.text();
		  android.navigate();
		  
		  Phone nokia = new Phone();
		  
		  nokia.brand = "Nokia";
		  nokia.color = "Blue";
		  nokia.price = 30;
		  
		  nokia.call();
		  nokia.text();
		  nokia.navigate();

	}

}
