package com.general.code.pracitice;

import java.util.Scanner;

public class SwappingNumbers {
	public static void main(String[] args) {
		int x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x");
		x = sc.nextInt();
		System.out.println("enter y");
		y = sc.nextInt();

		System.out.println("Before swapping" + x + "----" + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After swapping " + x + "----" + y);
	}
}
