package com.interviewprograms;

import java.util.Scanner;

public class LargestOf3Numbers {
	public static void main(String[] args) {
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		x = sc.nextInt();
		y = sc.nextInt();
		z = sc.nextInt();

		if (x > y && x > z) {
			System.out.println("First number is largest.");
		} else if (y > x && y > z) {
			System.out.println("secound number is largest.");
		} else if (z > x && z > y) {
			System.out.println("third number is largest");
		} else
			System.out.println("Entered numbers is equal.");
	}
}
