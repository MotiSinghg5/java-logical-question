package javabasicquestion;

import java.util.Scanner;

public class CheckEvenOrOdd {
	public static void main(String[] args) {

		System.out.println("please enter number : ");

		try (Scanner scanner = new Scanner(System.in);) {

			int number = scanner.nextInt();

			if (number <= 0) {
				throw new IllegalArgumentException("invalid number  " + number);
			} else {
				if (number % 2 == 0) {
					System.out.println("provide number is even");
				} else {
					System.out.println("provide number is odd");
				}
			}

		}
	}

}
