package com.general.code.pracitice;

import java.util.Scanner;

public class SwappingExample {
	public static void main(String[] args) {
		int x, y, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x");
		x = sc.nextInt();
		System.out.println("Enter y");
		y = sc.nextInt();
		System.out.println("Before swapping " + x + " " + y);

		temp = x;
		x = y;
		y = temp;
		System.out.println("After swapping " + x + " " + y);

	}
}
