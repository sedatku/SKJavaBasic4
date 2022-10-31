package com.neotech.lesson15;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Word: ");
		String word = scan.next();
		System.out.println("Separator: ");
		String separator = scan.next();
		System.out.println("count: ");
		int count = scan.nextInt();
		String total = "";
		// length

		if (word.length() > separator.length()) {

			if (count == 1) {

				System.out.println(word);
			} else if (count >= 2) {
				for (int i = 1; i < count; i++) {
					total = word + separator + total;

				}
				System.out.println(total + word);

			}
		}

			else if (word.length() < separator.length()) {

				if (count == 1) {
					System.out.println(word);
				
				} else if (count >= 2) {
					for (int i = 1; i < count; i++) {
						total = separator + word + total;

					}
					System.out.println(total + separator);

				}

			}

		}

	}


