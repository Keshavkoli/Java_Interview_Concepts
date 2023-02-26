package com.learn.java.arrays;

public class Additionof2Matrices {
	public static void main(String[] args) {
		// creating two matrices
		int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int b[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		// creating another matrix to store the sum of two matrices
		int c[][] = new int[3][3];
		// adding and printing addition of 2 matrices
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = a[i][j] * b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}
}