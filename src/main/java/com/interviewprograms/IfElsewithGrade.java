package com.interviewprograms;

import java.util.Scanner;

public class IfElsewithGrade {
	public static void main(String[] args) {
		int marksObtained, passingmarks;
		int grade;
		System.out.println("Enter the Passing Marks");
		Scanner sc = new Scanner(System.in);
		passingmarks = 60;
		marksObtained = sc.nextInt();
		{
			if (marksObtained > 90) {
				grade = 'A';
				System.out.println("A");
			} else if (marksObtained > 80) {
				grade = 'B';
				System.out.println("B");
			} else if (marksObtained > 70) {
				grade = 'C';
				System.out.println("C");
			} else if (marksObtained <= passingmarks) {
				System.out.println("just passed");
			} else if (marksObtained < 60) {
				System.out.println("YOU have not passed the exam!");
			}

		}
	}
}