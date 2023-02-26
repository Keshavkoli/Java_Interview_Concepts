package com.learn.java.arrays;

public class FindMin {

	static void min(int arr[]) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++)
			if (min > arr[i])
				min = arr[i];
		System.out.println(min);
	}

	static void max(int arr[]) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++)
			if (max < arr[i])
				max = arr[i];
		System.out.println(max);
	}

	public static void main(String[] args) {
		int a[] = { 1, 23, 34, 67, 76, 8, 2, 0 };
		min(a);
		max(a);
	}
}
