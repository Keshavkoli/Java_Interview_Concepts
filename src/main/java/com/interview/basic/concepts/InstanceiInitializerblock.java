package com.interview.basic.concepts;

//Instance Initializer block is used to initialize the instance data member. It run each time when object of the class is created.
class Bike7 {
	int speed;

	Bike7() {
		System.out.println("speed is " + speed);
	}

	{
		speed = 100;
	}
}

public class InstanceiInitializerblock {
	public static void main(String[] args) {
		Bike7 b1 = new Bike7();
		Bike7 b2 = new Bike7();
	}
}
