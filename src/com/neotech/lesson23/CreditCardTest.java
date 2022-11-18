package com.neotech.lesson23;

public class CreditCardTest {

	public static void main(String[] args) {
		CreditCard cc = new CreditCard();
		cc.calculateInterest(2000, 7.5);
		
		Visa vc = new Visa();
		vc.calculateInterest(2900, 7.7);
		
		Ax axc = new Ax();
		axc.calculateInterest(3000, 7.6);
		

	}

}
