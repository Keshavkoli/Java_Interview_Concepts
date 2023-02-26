package com.general.code.pracitice;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		String a, b;
		StringBuffer sb;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		a = sc.nextLine();
		sb = new StringBuffer(a);
		b = sb.reverse().toString();
		System.out.println(b);

		if (sb.equals(a)) {
			System.out.println("its a palindrome");
		} else {
			System.out.println("its not an palindrome");
		}
	}
}
