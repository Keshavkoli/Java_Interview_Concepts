package com.interviewprograms;

public class StaticNonStaticDiffer {
	int a = 10;
	static int b = 20;

	public static void main(String[] args) {
		StaticNonStaticDiffer s = new StaticNonStaticDiffer();
		StaticNonStaticDiffer.Res(); // we can get the static method with class.methodName
		s.Disp();// we have create an obj to get the Non-static method
	}

	static void Res() {
//		System.out.println(a +" "+b); we cannot call non-static variable inside a static method
		System.out.println("SHOW method  " + " " + b + " " + "Static Method");

	}

	void Disp() {
		System.out.println("Disp  " + a + " " + b + " " + "Non - Static Method");
	}
}
