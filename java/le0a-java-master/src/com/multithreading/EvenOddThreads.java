package com.multithreading;

public class EvenOddThreads {
	public static void main(String[] args) {
		// instance of a thread class
		EvenThread evenThread = new EvenThread();
		evenThread.start();
		OddThread oddThread = new OddThread();
		oddThread.start();
	}
}

class EvenThread extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 51; i = i + 2) {
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