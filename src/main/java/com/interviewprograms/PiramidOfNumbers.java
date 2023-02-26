package com.interviewprograms;

public class PiramidOfNumbers {
	public static void main(String[] args) {
		int height = 5;
		for (int i = 1; i <= height; i++) {
			for (int j = height - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i +"  ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		int height1 = 5;
		for (int i = 1; i <= height1; i++) {
			for (int j = height1 - 1; j >= i; j--) {
				System.out.print(" ");
				System.out.print(j +"  ");
			}
			for (int k = 1; k <= i; k++) {
				
			}
			System.out.println();
		}
	}
}
