package com.string.concept;

public class Compare2string {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = "melo";
		String str4 = "kelo";
		System.out.println(str1.compareTo(str1));
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareTo(str3));
		System.out.println(str1.compareTo(str4));
	}
}
