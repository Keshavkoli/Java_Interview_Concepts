package com.exceptionhandling;

public class FinallyExample {
	public static void main(String[] args) {
		int arr[] = new int[1000000000];
		System.out.println(arr.toString());
		try {
			int arr1[] = new int[1000000000];
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		} finally {
			System.out.println("finally block will execute always");
		}
	}
}
