package com.learn.java.arrays;

public class ExampleofMultidimensional {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 4, 5 } };
		// printing 2D array
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----separate the Line--------");

		int arr1[][] = { { 1, 2, 3 }, { 4, 4, 5 }, { 12, 34, 6 } };
		// printing 2D array
		for (int k = 0; k < 3; k++) {
			for (int l = 0; l < 3; l++) {
				System.out.print(arr1[k][l] + " ");
			}
			System.out.println();
		}
		System.out.println("-----separate the Line--------");
		int arr2[][] = { { 1, 2, 3, 8 }, { 4, 4, 5, 9 }, { 12, 34, 6, 34 } };
		// printing 2D array
		for (int m = 0; m < 4; m++) {
			for (int n = 0; n < 4; n++) {
				System.out.print(arr2[m][n] + " ");
			}
			System.out.println();
		}

	}

}
