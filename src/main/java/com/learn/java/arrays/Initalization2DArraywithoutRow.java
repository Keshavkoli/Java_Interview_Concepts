package com.learn.java.arrays;

public class Initalization2DArraywithoutRow {
	public static void main(String[] args) {
		// The line below will throw an error, as the first
		// dimension(no. of rows) is not specified
//		int[][] arr = new int[][3];

		// The line below will execute without any error, as
		// the first dimension(no. of rows) is specified
		int[][] arr1 = new int[2][];
		System.out.println(arr1.toString());
	}
}
