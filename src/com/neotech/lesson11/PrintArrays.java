package com.neotech.lesson11;

public class PrintArrays {

	public static void main(String[] args) {
		int[] points = { 90, 85, 95, 75, 93, 95, 100 };

		// printing one by one
		System.out.println(points[0]);
		System.out.println(points[1]);
		System.out.println(points[2]);
		System.out.println(points[3]);
		System.out.println(points[4]);
		System.out.println(points[5]);

		System.out.println();
		int size = points.length;
		int sum = 0;

		for (int i = 0; i < size; i++) {
			System.out.print(points[i] + " ");
			sum += points[i];
		}
		System.out.println();
		System.out.println("Sum= " + sum);

		System.out.println("Avarage= " + (sum / size));

		// how can we get the sum of all values in the points array?

	}

}
