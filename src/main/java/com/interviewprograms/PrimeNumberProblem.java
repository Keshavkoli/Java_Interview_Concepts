package com.interviewprograms;

import java.util.Scanner;

public class PrimeNumberProblem {
	public static void main(String[] args) {
		int count = 0;
		System.out.println("ENTER THE NUMBER");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(num + "  is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
	}
}
