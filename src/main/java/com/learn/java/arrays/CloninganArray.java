package com.learn.java.arrays;

public class CloninganArray {
	public static void main(String[] args) {
		int arr[] = { 2, 3, 4, 2, 5, 6, 7 };
		System.out.println(arr.hashCode());
		System.out.println("print the original");
		for (int i : arr)
			System.out.println(i);

		System.out.println("Printing the clone");
		int car[] = arr.clone();
		System.out.println(car.hashCode());
		for (int i : car)
			System.out.println(i);
		System.out.println("Are both equal?");
		System.out.println(arr == car);
		System.out.println(arr.equals(car));
	}

}

