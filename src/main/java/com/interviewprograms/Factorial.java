package com.interviewprograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		int fact = 1, num;
		System.out.println("ENTER THE NUMBER");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		if (num < 0) {
			System.out.println("Number should be non-negative.");
		} else {

			for (int i = 1; i <= num; i++)
				fact = fact * i;
			System.out.println(fact);
		}
	}
}
