package com.concept.multithreading;

public class SleepMethodExample extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(i);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		SleepMethodExample sm = new SleepMethodExample();
//		SleepMethodExample sme = new SleepMethodExample();
		sm.start();
//		sme.start();
		//sm.start(); // when we start two threads the only one thread we execute and the another will
					// throw Exception it will throw  java.lang.IllegalThreadStateException
	}

}
/**
 at a time only one thread is executed. If you sleep a thread for the specified time,
 the thread scheduler picks up another thread and so on
 */
