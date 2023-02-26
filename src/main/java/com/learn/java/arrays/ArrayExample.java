package com.learn.java.arrays;

import java.util.TreeSet;
//ArrayExample to sort Multi-dimensional array
public class ArrayExample {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 3 }, { 4, 5, 6 }, { 7, 8, 9, 3 } };
		TreeSet<Integer> tree = new TreeSet<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				tree.add(arr[i][j]);// TreeSet is used to remove the duplicate and sort in order
//				System.out.println(arr[i][j]);
			}
		}
		System.out.println(tree);
	}
}
