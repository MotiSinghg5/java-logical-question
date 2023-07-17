package javabasicquestion;

import java.util.Scanner;

public class FibonacciGenerator {

	public static void main(String[] args) {
		System.out.println("Please enter number:");

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int num1 = 0, num2 = 1, num3;
		System.out.print(num1 + " " + num2);
		for (int i = 2; i <= num; i++) {
			num3 = num1 + num2;
			System.out.print(" " + num3);
			num1 = num2;
			num2 = num3;
		}

		scanner.close();
	}
}
