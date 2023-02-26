package com.learn.java.arrays;

import java.util.TreeSet;

public class ThreeDimenstioanlArrayExample {
	public static void main(String[] args) {
		int[][][] arr = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }, { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
				{ { 12, 22, 32 }, { 42, 52, 62 }, { 72, 82, 92 } } };
		TreeSet<Integer> ts = new TreeSet<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for (int k = 0; k < arr[j].length; k++) {
					ts.add(arr[i][j][k]);
					System.out.println(arr[i][j][k]);
				}
			}
		}
		System.out.println(ts); // to sort and remove duplicate we use TreeSet
	}
}
