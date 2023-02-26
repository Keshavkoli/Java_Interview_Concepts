package com.string.concept;

public class SplitExample {
	public static void main(String[] args) {
		String s1 = "java string split method by Technolamror";
		String[] words = s1.split("\\s");// splits the string based on whitespace
		// using java foreach loop to print elements of string array
		for (String split : words)
			System.out.println(split);
		System.out.println("---------------div----------------");
		// The string trim() method doesn't omit middle spaces
		String s2 = "hello string  ";
		System.out.println(s2 + "javatpoint");// without trim()
		System.out.println(s2.trim() + "javatpoint");// with trim()

	}
}
