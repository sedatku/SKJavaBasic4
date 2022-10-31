package com.neotech.lesson19;

class TaskDemo {

	public static void main(String[] args) {

// can we access it by class name
		Task obj = new Task();
		
		int[] arr = {43, 54, 76, 37, 66};
		
		int sum = obj.sum(arr);

		System.out.println("The total sum of the array is: " + sum);
		
		
		

	}

}
