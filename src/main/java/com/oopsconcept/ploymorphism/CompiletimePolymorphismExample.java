package com.oopsconcept.ploymorphism;

//Compile Time polymorphism is implemented through Method overloading and Operator overloading.
public class CompiletimePolymorphismExample {
	void show(int num1) {
		System.out.println("number 1 : " + num1);
	}

	void show(int num1, int num2) {
		System.out.println("number 1 : " + num1 + "  number 2 : " + num2);
	}

	// argument of this function are of float type
	static void show(double a, double b) {
		System.out.println("This is double function ");
	}

	static void show(int a, char ch) {
		System.out.println("integer : " + a + " and character : " + ch);
	}

	// argument of this function are of char and int type
	static void show(char ch, int a) {
		System.out.println("character : " + ch + " and integer : " + a);
	}

	public static void main(String[] args) {
		CompiletimePolymorphismExample ctp = new CompiletimePolymorphismExample();
		ctp.show(21);// int
		ctp.show(21, 22);// int
		ctp.show(12.12, 22.23);// double
		ctp.show(12, 'a');// int and char
		ctp.show('b', 21);// char and int
	}
}
