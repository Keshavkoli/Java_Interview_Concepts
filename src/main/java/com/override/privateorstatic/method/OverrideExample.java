package com.override.privateorstatic.method;

// we cannot override a static and private method into another class
class Base {
	private static void display() {
		System.out.println("Static or class method from Base");
	}

	public void print() {
		System.out.println("Non-static or instance method from Base");
	}
}

class Derived extends Base {
	private static void display() {
		System.out.println("Static or class method from Derived");
	}

	public void print() {
		System.out.println("Non-static or instance method from Derived");
	}
}

public class OverrideExample extends Derived {
	public static void main(String[] args) {
		Base obj = new Derived();
//		obj.display(); we cannot override the static method into another static method 
		obj.print();
	}
}
