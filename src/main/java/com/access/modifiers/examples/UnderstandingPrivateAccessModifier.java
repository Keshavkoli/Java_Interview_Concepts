package com.access.modifiers.examples;

// we will understand the access level of private modifier
//Private: The access level of a private modifier is only within the class. It cannot be accessed from outside the class
//Note: A class cannot be private or protected except nested class
class A {
	private int data = 40;

	private void msg() {
		System.out.println("Hello java");
	}
}
public class UnderstandingPrivateAccessModifier {
	A a = new A();
	// a.msg(); comile time error
	private int data = 40;

	private void msg() {
		System.out.println("Hello java");
	}

	public static void main(String[] args) {
		UnderstandingPrivateAccessModifier upam = new UnderstandingPrivateAccessModifier();
		System.out.println(upam.data);
		upam.msg();
	}
}
