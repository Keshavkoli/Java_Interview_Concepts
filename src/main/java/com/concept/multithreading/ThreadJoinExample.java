package com.concept.multithreading;

class ThreadJoin extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(300);
				System.out.println("The current thread name is: " + Thread.currentThread().getName() + "==3");
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println(e);
			}
			System.out.println(i);
		}

	}
}

public class ThreadJoinExample extends Thread {
	public static void main(String[] args) {
		ThreadJoin t1 = new ThreadJoin();
		ThreadJoin t2 = new ThreadJoin();
		ThreadJoin t3 = new ThreadJoin();
		t1.start();
		try {
			System.out.println("The current thread name is: " + Thread.currentThread().getName() + "==1");
			t1.join();
		} catch (Exception e) {
			System.out.println("The exception has been caught " + e);
			t2.start();
			try {
				System.out.println("The current thread name is: " + Thread.currentThread().getName() + "2");
				t2.join();
			} catch (Exception e1) {
				System.out.println("The exception has been caught " + e1);
				t3.start();
			}
		}
	}
}
