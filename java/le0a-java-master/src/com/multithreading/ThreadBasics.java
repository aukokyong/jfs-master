package com.multithreading;

public class ThreadBasics {
	public static void main(String[] args) {
		String threadName = null;
		Thread thisThread = Thread.currentThread();
		threadName = thisThread.getName();
		System.out.println(threadName);
		System.out.println(thisThread.getPriority());
		thisThread.setPriority(Thread.MIN_PRIORITY);
		System.out.println(thisThread.getPriority());
		thisThread.setPriority(Thread.MAX_PRIORITY);
		System.out.println(thisThread.getPriority());
		thisThread.setPriority(3);
		System.out.println(thisThread.getPriority());
		try {
			thisThread.setPriority(300);
			System.out.println(thisThread.getPriority());
		} catch (IllegalArgumentException exception) {
			System.out.println("Illegal Arg Exc");
		}
		for (int i = 0; i < 11; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("This thread has been interrupted....");
			}
			System.out.println(i);
		}
	}
}
