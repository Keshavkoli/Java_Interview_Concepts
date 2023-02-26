package com.interviewprograms;

import java.util.Scanner;

public class PrintMultiplicationtable {
	public static void main(String[] args) {
		int number, count;
		System.out.println("enter number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		System.out.println("enter multiplication  " + number);
		for (count = 1; count <= 10; count++) {
			System.out.println(number + " * " + count + " = " + (number * count));
		}
		System.out.println("------------------between a range------------");
		int a, b, c, d;
		System.out.println("Enter range of numbers to print their multiplication table");
		Scanner in = new Scanner(System.in);
		a = in.nextInt();
		b = in.nextInt();
		for (c = a; c <= b; c++) {
			System.out.println("Multiplication table of " + c);
			for (d = 1; d <= 10; d++) {
				System.out.println(c + "*" + d + " = " + (c * d));
			}
		}
	}
}
