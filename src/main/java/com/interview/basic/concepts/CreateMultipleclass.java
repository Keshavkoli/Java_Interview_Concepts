package com.interview.basic.concepts;

class Computer {
	Computer() {
		System.out.println("Constructor of Computer class.");
	}

	void computer_method() {
		System.out.println("Power gone! Shut down your PC soon...");
	}
}

public class CreateMultipleclass {
	public static void main(String[] args) {
		Computer com = new Computer();
		com.computer_method();
		Laptop lap = new Laptop();
		lap.laptop_method();
	}

}

class Laptop {
	Laptop() {
		System.out.println("Constructor of Laptop class.");
	}

	void laptop_method() {
		System.out.println("99% Battery available.");
	}
}