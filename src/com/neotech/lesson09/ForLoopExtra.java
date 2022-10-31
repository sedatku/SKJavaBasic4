package com.neotech.lesson09;

public class ForLoopExtra {

	public static void main(String[] args) {
		
		System.out.println("Print numbers from 21 to 30");
		
		for (int i=21; i<=30; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("print numbers from 20 to 1");
		for (int j =20; j>=1; j--) {
			System.out.print(j + " ");
		}
		
		System.out.println();
		System.out.println("Print odd numbers from 1 to 10");
		for (int i =1; i <10; i+=2) {
			System.out.print(i + " ");
		}
		
		System.out.println();

		System.out.println("Print odd numbers from 1 to 10 - 2nd way");
		
		for(int i =1; i <=10; i++) {
			if(i%2==1) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();

		System.out.println("Print odd numbers from 1 to 10 - 3rd way");
		for (int i = 1; i <=10; i++) {
			System.out.print(i + " ");
			i++;
		}
		int sum = 0;
		System.out.println("\nPrint the sum of numbers from 3 to 7");
		for (int i = 3; i <=7; i++) {
			sum +=i; //sum = sum +i;
		}
		System.out.println(sum);
		
	}

}
