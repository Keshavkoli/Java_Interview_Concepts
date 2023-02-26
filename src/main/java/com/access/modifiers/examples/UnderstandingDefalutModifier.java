package com.access.modifiers.examples;

//The access level of a default modifier is only within the package. It cannot be accessed from outside the package.
//If you do not specify any access level, it will be the default

class Building {
	int cement = 20;

	void msg() {
		System.out.println("Construction site");
	}

	void material() {
		System.out.println("Cement is required to build");
	}
}

public class UnderstandingDefalutModifier {
	public static void main(String[] args) {
		Building b = new Building();
		System.out.println(b.cement);
		b.material();
		b.msg();

	}
}
