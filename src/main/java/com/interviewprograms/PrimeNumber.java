package com.interviewprograms;

import java.util.Scanner;

//this are not prime numbers
//a whole number greater than 1 that cannot be exactly divided by any whole number other than itself and 1 (e.g. 2, 3, 5, 7, 11).
public class PrimeNumber {
	public static void main(String[] args) {
		int number, count = 0;
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(number + " number is prime ");
		} else {
			System.out.println(number + " number is not prime ");
		}
	}
}
