package com.oops.concept.abstraction;

abstract class Animal {
	// Abstract method (does not have a body)
	abstract void animalSound();

	// Regular method
	abstract void sleep();
}

abstract class Money {
	int salary = 15000;

	abstract void money();
}
