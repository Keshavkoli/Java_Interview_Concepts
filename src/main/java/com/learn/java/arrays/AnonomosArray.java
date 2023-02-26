package com.learn.java.arrays;

public class AnonomosArray {
	static void getAno(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

	public static void main(String[] args) {
		getAno(new int[] {23,54,67,78,12});
	}
}
