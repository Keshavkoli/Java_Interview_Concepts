package com.general.code.pracitice;

import java.util.Scanner;

public class LargestOfThreeNumbers {
	public static void main(String[] args) {
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x");
		x = sc.nextInt();
		System.out.println("Enter y");
		y = sc.nextInt();
		System.out.println("Enter z");
		z = sc.nextInt();

		if (x > y && x > z) {
			System.out.println("Number first is greater");
		} else if (y > x && y > z) {
			System.out.println("Secound number is greater");
		} else if (z > x && z > y) {
			System.out.println("Thrird is number greater");
		} else {
			System.out.println("Entered numbers are not distinct.");
		}
	}
}
