package com.interview.basic.concepts;

//code Difference between Static and Instance  method working in java Program
public class StaticandInstanceMethodWorking {
	public static void main(String[] args) {
		// calling without object
		display();
		StaticandInstanceMethodWorking st = new StaticandInstanceMethodWorking();
		st.show();//// calling using object
		// show(); we cannot call non-static method with-out creating a object
	}

	static void display() {
		System.out.println("Programming is amazing.");
	}

	void show() {
		System.out.println("Java is awesome.");
	}
}
