package com.multithreading;

public class EvenOddThreads {
	public static void main(String[] args) {
		// instance of a thread class
		EvenThread evenThread = new EvenThread();
		evenThread.start();
//		evenThread.stop();
		OddThread oddThread = new OddThread();
		oddThread.start();
		try {
			evenThread.join(1);
			oddThread.join(1);
		} catch (InterruptedException e) {
			System.out.println("Thread Interrupted");
		}

		System.out.println("Thank you for using the application!!! ");
	}
}

class EvenThread extends Thread {
	@Override
	public void run() {

		for (int i = 0; i < 51; i = i + 2) {
//			if(i== 4)
//				return;
			System.out.print(i + " ");
		}
		System.out.println("\nEvenThread " + Thread.currentThread().getName());
	}
}

class OddThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i < 51; i = i + 2) {
			System.out.print(i + " ");
		}
		System.out.println("\nOdd Thread " + Thread.currentThread().getName());
	}
}