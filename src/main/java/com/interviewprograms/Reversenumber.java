package com.interviewprograms;

import java.util.Scanner;
// 2 varibles number and reverse = 0
//while loop number!=0 
//formula *,+,%,and division

public class Reversenumber {
	public static void main(String[] args) {
		int number = 0, reverse = 0;
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		number = sc.nextInt();
		while (number != 0) {
			reverse = reverse * 10;
			reverse = reverse + number % 10;
			number = number / 10;
		}
		System.out.println("reverse ==> " + reverse);
		System.out.println("-------------------------------------");

		String input;
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter String to reverse ");
		input = sn.nextLine();
		StringBuffer sb = new StringBuffer(input);
		System.out.println(sb.reverse());

	}
}
