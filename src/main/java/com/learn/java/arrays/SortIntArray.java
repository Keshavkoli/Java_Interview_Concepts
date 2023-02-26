package com.learn.java.arrays;

import java.util.Arrays;
// we can sort int array with Arrays.sort() method
public class SortIntArray {
	public static void main(String[] args) {
		int[] array = new int[] { 90, 23, 5, 109, 12, 22, 67, 34 };
		Arrays.sort(array);
		System.out.println("Elements of array sorted in ascending order: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
