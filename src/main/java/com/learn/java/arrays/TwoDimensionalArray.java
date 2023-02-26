package com.learn.java.arrays;

public class TwoDimensionalArray {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 3, 4 } };

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
//			System.out.println();
		}
		int[][][] arr1 = new int[10][20][30];
		arr1[0][0][0] = 1;
		System.out.println("--------------------div---------------------");
		System.out.println("arr[0][0][0] = " + arr1[0][0][0]);

		System.out.println("--------------------div---------------------");
		int[][][] arr2 = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };

		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 2; j++)
				for (int z = 0; z < 2; z++)
					System.out.println("arr[" + i + "][" + j + "][" + z + "] = " + arr2[i][j][z]);
	}
}
