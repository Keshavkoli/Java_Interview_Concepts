package com.concept.multithreading;

// we cannot start a thread twice it will throw IllegalThreadStateException 
// we have to extend the class to thread class than it will accept the start method in code 
public class TestThreadTwice extends Thread {
	public void run() {
		System.out.println("Thread is running");
	}
	
	public static void main(String[] args) {
		TestThreadTwice t1 = new TestThreadTwice();
		TestThreadTwice t2 = new TestThreadTwice();
		t1.start();
//		t1.start(); it will throw an exception IllegalThreadStateException
		t2.start();
		t1.run();
		t1.run();
	}
}
