package com.neotech.lesson22;

public class SportsCar extends Car {
	
	int seats;
	
	SportsCar() {
		
		System.out.println("SportsCar Default Constructor");
	}
	
	SportsCar(String make, String model, int seats){
//		super(make, model); //calling the superclass constructor that has a signature signature 
//		this.seats = seats;
		
	}
	
	void driving() 
	{
		System.out.println("Sports cars have two seats!");
	}
	
	void drifting ()
	{
		System.out.println("Sports cars can drift!");
	}
	
	

}



class LuxurySportsCar extends SportsCar 
{
	int speed;
	
	LuxurySportsCar()
	{
		System.out.println("LuxurySoprtsCar Default Constructor");
	}
	
	LuxurySportsCar (String make, String model, int seats, int speed)
	{
	 super(make, model, seats);
	 this.speed = speed;
		
//		System.out.println(make + " " + model + " " + speed + " " + seats);
	}
	
	void driving()
	{
		System.out.println("LuxurySportsCars drive faster");
	}
	void racing()
	{
		System.out.println("LuxurySportsCars can racing");
	}
	
	
	
}
