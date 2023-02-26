package com.learn.java.arrays;

import java.util.TreeSet;

public class ThreeDimensionalArray {
	public static void main(String[] args) {
		int[][][] arr = { { { 1, -2, 3 }, { 2, 3, 4 } }, { { -4, -5, 6, 9 }, { 1 }, { 2, 3 } } };
		System.out.println("\n---------3Dimention------------");
		TreeSet st = new TreeSet();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[i][j].length; k++) {
					System.out.print(arr[i][j][k] + " ");
					st.add(arr[i][j][k]);
				}
			}
		}
		System.out.println("\nTreeSet Removes Duplicate");
		System.out.println(st);
	}
}
