package com.neotech.lesson23;
//Homework 1:
//Create a class CreditCard and define two variables, balance and interest. 
//Create an instance method that will calculate the interest based on the given balance.
//Create 2 subclasses: Visa and AX. In AX class override the method calculate interest.
//Call the method by creating an object of each of the three classes.
public class CreditCard {
	int balance;
	double interest;
	double totalIntr;

	public double totalInterest(int balance, double interest) {
		totalIntr = balance * interest *0.01;
		return totalIntr;
	}
	void calculateInterest(int balance, double interest) {
		this.balance = balance;
		this.interest = interest;
		double totalIntr = totalInterest(balance, interest);
		
		System.out.println("Your Credit Card's balance: $"+ balance + ", Interest rate: %" 
		+ interest+ ", Total interest: $" + totalIntr + ", Total Dept: $" + (balance + totalIntr));
	}
}
class Visa extends CreditCard {
	void calculateInterest(int balance, double interest) {
		super.balance = balance;
		super.interest = interest;
		totalInterest(balance, interest);

		System.out.println("Your Visa Card's balance: $"+ balance + ", Interest rate: %" 
		+ interest+ ", Total Interest: $" + totalIntr + ", Total Dept: $" + (balance +  totalIntr));
	}
}
class Ax extends CreditCard {
	void calculateInterest(int balance, double interest) {
		super.balance = balance;
		super.interest = interest;
        System.out.println("Your Ax Card's balance: $"+ balance + ", Interest rate: %" 
 				+ interest+ ", Total Interest: $" + totalIntr + ", Total Dept: $" + (balance +  totalIntr));
	}
}