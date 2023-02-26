package com.concept.multithreading;
// we can run run() method twice
public class TestCallRun extends Thread {
	public void run() {
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		TestCallRun tc = new TestCallRun();
		tc.run();
		tc.run();
	}
}
