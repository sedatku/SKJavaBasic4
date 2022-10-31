package com.neotech.lesson12;

public class TwoDimensionalArrayLength {

	public static void main(String[] args) {

		String[][] months = { { "December", "January", "February" }, // row 0
				{ "March", "April", "May" }, // row 1
				{ "June", "July", "August" }, // row 2
				{ "September", "October", "November" }, // row 3

		};
//		
//		int rowCount = months.length;
//		System.out.println("There are a total of " + rowCount + " rows");
//
//		int lenghtOfRowIndex1 = months[1].length;
//		int lenghtOfRowIndex2 = months[2].length;
//
//		System.out.println("Row index 1 has " + lenghtOfRowIndex1 + " colums");

		for (String[] innerArray : months) {
			for (String data : innerArray) {
				if (data.equals("September")) {
					System.out.println(data);
				}
			}

		}

	}

}
