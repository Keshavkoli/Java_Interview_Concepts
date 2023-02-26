package com.oopsconcept.ploymorphism;

public class ComplieTimeOperatorOverloading {
	void add(int a, int b) {
		int sum = a + b;
		System.out.println(" Addition of two integer :" + sum);
	}

	// function for concatenating two strings
	void add(String s1, String s2) {
		String con_str = s1 + s2;
		System.out.println("Concatenated strings :" + con_str);
	}

	public static void main(String[] args) {
		ComplieTimeOperatorOverloading ctpo = new ComplieTimeOperatorOverloading();
		ctpo.add(11, 12);
		ctpo.add(21, 22);
		ctpo.add("mahesh ", "koli");
		ctpo.add("kartik ", "koli");
	}
}
