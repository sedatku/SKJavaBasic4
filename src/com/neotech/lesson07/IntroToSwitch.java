package com.neotech.lesson07;

public class IntroToSwitch {

	public static void main(String[] args) {
		//given 1 - 7 then print the name of the day
		
		int day = 5;
		String dayName ="";
		
//		if (day ==1)
//		{
//			System.out.println("Monday");
//		}
//		else if (day ==2)
//		{
//			System.out.println("Tuesday");
//		}
//		else if (day ==3)
//		{
//			System.out.println("Wednesday");
//		}
//		else if (day ==4)
//		{
//			System.out.println("Thursday");
//		}
//
//		else if (day ==5)
//		{
//			System.out.println("Friday");
//		}
//		else if (day ==6)
//		{
//			System.out.println("Saturday");
//		}
//		else if (day ==7)
//		{
//			System.out.println("Sunday");
//		}
//		
//		else {
//			System.out.println("Invalid input");
//		}
//		
		
		//using switch case:
		
		switch (day) //we use the variable that we want to compare the value
		{
		case 1: 
			//System.out.println("Monday");
			dayName = "Monday";
			break;
		case 2:
			//System.out.println("Tuesday");
			dayName = "Tuesday";
			break;
		case 3:
			//System.out.println("Wednesday");
			dayName = "Wednesday";
			break;
		case 4:
			//System.out.println("Thursday");
			dayName = "Thursday";
			break;
		case 5:
			//System.out.println("Friday");
			dayName = "Friday";
			break;
		case 6:
			//System.out.println("Saturday");
			dayName = "Saturday";
			break;
		case 7:
			//System.out.println("Sunday");
			dayName = "Sunday";
			break;
		default:
			System.out.println("Invalid value");
			break;
			
			
				
		}
		
		System.out.println(dayName);
		
		
	}

}
