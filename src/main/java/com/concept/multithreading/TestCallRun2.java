package com.concept.multithreading;

// we can have run() without extending the class to Thread class
// but we cannot have the start() without extending the class to Thread class
//Invoking the run() method from the main thread, the run() method goes onto the current call stack rather 
//than at the beginning of a new call stack
public class TestCallRun2 {
	public void run() {
		for (int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(100);

			} catch (InterruptedException e) {
				e.printStackTrace();
				System.out.println("Exception handled " + e);
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		TestCallRun2 t1 = new TestCallRun2();
		TestCallRun2 t2 = new TestCallRun2();
		t1.run();
		t2.run();
	}
}
