package com.learn.java.arrays;

public class ClassNameOfJavaArray {
	public static void main(String[] args) {
		int arr[] = { 3, 3, 43, 32, 2, 1, 12, 3 };
		Class c = arr.getClass();
		String name = c.getName();
		System.out.println(name);
	}
}
