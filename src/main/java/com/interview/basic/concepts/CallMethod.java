package com.interview.basic.concepts;

// code How to create method in java Program
class Methods {
	// Constructor method
	Methods() {
		System.out.println("Constructor method is called when an object of it's class is created");
	}

}

public class CallMethod {
	public static void main(String[] args) {
		staticMethod();
//		nonStaticMethod(); Non static method are not allowed in static methods
		CallMethod m = new CallMethod();
		m.nonStaticMethod();
		m.staticMethod();
	}

	// Static method
	static void staticMethod() {
		System.out.println("Static method can be called without creating object");
	}

//Non static method
	void nonStaticMethod() {
		System.out.println("Non static method must be called by creating an object");
	}
}
