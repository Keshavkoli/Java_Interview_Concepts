package com.learn.java.arrays;

public class MAXArray {
	public static void main(String[] args) {
		int arr[] = new int[] { 1, 12, 13, 14, 25 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		System.out.println("largest number " + max);
	}

}
