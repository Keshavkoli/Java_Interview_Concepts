package com.oops.concept.abstraction;

class Income extends Animal {
	public void animalSound() {
	}

	void sleep() {

	}
}

public class AbstractionExample extends Income {
	private void money() {

	}

	public static void main(String[] args) {
		AbstractionExample ae = new AbstractionExample();
		ae.money();
		ae.animalSound();
		ae.sleep();
	}

}
