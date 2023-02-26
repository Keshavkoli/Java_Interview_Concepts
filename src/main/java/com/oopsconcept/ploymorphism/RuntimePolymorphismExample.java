package com.oopsconcept.ploymorphism;

//Run time polymorphism is implemented through Method overriding.
class Bike {
	void runbike() {
		System.out.println("running runbike");
	}

	void run() {
		System.out.println("running");
	}
}

class Splendor extends Bike {
	void run() {
		System.out.println("running safely with 60km");
	}

	void runsple() {
		System.out.println("running safely with Splendorn bike with  60km");
	}
}

public class RuntimePolymorphismExample extends Splendor {
	public static void main(String[] args) {
		RuntimePolymorphismExample prm = new RuntimePolymorphismExample();
		prm.runbike();
		Bike b = new Splendor();
		b.run();// upcastingRuntime
		// Splendor sp = new Bike(); downcasting is not allowed gives complie time error
		// sp.run();
	}
}
