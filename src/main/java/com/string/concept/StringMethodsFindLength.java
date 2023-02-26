package com.string.concept;

//code Find Length, Concatenate and Replace String in Java Program
public class StringMethodsFindLength {
	public static void main(String[] args) {
		int n;
		String s = "Java programming", t = "", u = "";
		System.out.println(s);
		// Find length of string
		n = s.length();// finds the length of string
		System.out.println("Number of characters = " + n);
		// Replace characters in string
		System.out.println(s);
		t = s.replace("Java", "C++");// replaces java with C++
		System.out.println(t);
		// Concatenating string with another string
		u = s.concat("  is fun");
		System.out.println(u);
		u = t.concat("  should be learned");
		System.out.println(u);
	}
}
