package com.general.code.pracitice;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int number, count = 0;
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(number + "  is prime number");
		} else {
			System.out.println(number + "  is not prime number");
		}
	}
}
