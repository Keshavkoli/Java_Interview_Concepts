package com.problemwithoutsynchronization;

class GlassTable {
	void printTable(int n) {
		for (int i = 0; i <= 5; i++) {
			System.out.println(n * i);
		}
		try {
			Thread.sleep(400);

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
}

class MyThread extends Thread {
	GlassTable t;

	MyThread(GlassTable t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class Mythread2 extends Thread {
	GlassTable t;

	Mythread2(GlassTable t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

public class Syncronisation {
	public static void main(String[] args) {
		GlassTable obj = new GlassTable();
		MyThread t1 = new MyThread(obj);
		Mythread2 t2 = new Mythread2(obj);
		t1.start();
		t2.start();
	}

}
