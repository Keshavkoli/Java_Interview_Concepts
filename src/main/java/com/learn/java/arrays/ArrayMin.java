package com.learn.java.arrays;

public class ArrayMin {
	static void min(int arr[]) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++)
			if (min > arr[i])
				min = arr[i];
		System.out.println(min);
	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		min(arr);

	}
}
