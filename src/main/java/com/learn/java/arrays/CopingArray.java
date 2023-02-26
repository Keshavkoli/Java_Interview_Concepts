package com.learn.java.arrays;

public class CopingArray {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(i);
		}
		System.out.println("------------");
		int[] arr2 = arr.clone();
		for (int j = 0; j < arr2.length; j++) {
			System.out.println(arr[j]);
		}
		System.out.println("Are both equal");
		System.out.println(arr == arr2);

	}
}
