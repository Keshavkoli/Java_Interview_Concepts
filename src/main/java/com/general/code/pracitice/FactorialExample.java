package com.general.code.pracitice;

import java.util.Scanner;

public class FactorialExample {
	public static void main(String[] args) {
		int fact = 1;
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		num = sc.nextInt();
		for (int i = 1; i <= num; i++) {
			fact = fact * i;

		}
		System.out.println("Factorail of given number is = " + fact);
	}

}
