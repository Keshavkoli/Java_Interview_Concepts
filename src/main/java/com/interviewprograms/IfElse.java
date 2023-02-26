package com.interviewprograms;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		int marksObtained, passingmarks;
		System.out.println("Enter marksObtained");
		Scanner sc = new Scanner(System.in);
		passingmarks = 40;
		marksObtained = sc.nextInt();
		if (marksObtained >= passingmarks) {
			System.out.println("Student is passed!");
		} else {
			System.out.println("Student is not passed!");
		}

	}
}
