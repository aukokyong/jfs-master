package com.java8.lambda;

public class RunnableLambda {
	public static void main(String[] args) {
//	traditionalThreading();
//	traditionalThreading1();
//		anonymousClass();
		java8RunnableLambda();
	}

	public static void traditionalThreading() {
		String threadNameString = Thread.currentThread().getName();
		System.out.println("Executing in Main : " + threadNameString);
		TestThread testThread = new TestThread();
		testThread.start();
		testThread.start();
		testThread.method1();
		testThread.setName("Custom Thread 1");
		TestThread testThread1 = new TestThread();
		testThread1.start();
		testThread1.setName("Custom Thread 2");
		testThread1.method2();
	}

	public static void traditionalThreading1() {
		String threadNameString = Thread.currentThread().getName();
		System.out.println("Executing in Main : " + threadNameString);
		SpecialTest specialTest = new SpecialTest();
		Thread childThread = new Thread(specialTest);
		childThread.start();
		childThread.setName("Custom Thread 1");
//		childThread.method1();
		specialTest.method1();
	}

	public static void anonymousClass() {
//		Anonymous Thread class
		Thread thread = new Thread() {
			@Override
			public void run() {
				System.out.println("Anonymous class with Thread : " + Thread.currentThread().getName());
			}

		};
		thread.start();

		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("Anonymous class with Runnable : " + Thread.currentThread().getName());
			}
		};
		new Thread(runnable).start();
	}

	public static void java8RunnableLambda() {
//		old way
		Runnable runnable1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Anonymous class with Runnable : " + Thread.currentThread().getName());
			}
		};
		
//		Lambda expression ()->{};
//		Functional Programming can be implemented using Functional Interface.
//		Lambda expressions are an easy way to create anonymous classes.
//		The type of lambda expression is functional interface.
		Runnable runnable = ()-> System.out.println("Lambda with Runnable : ");
		new Thread(runnable).start();
		
		new Thread(()-> System.out.println("Lambda with Runnable concise ")).start();
	}
}

class TestThread extends Thread {
//	@Override
//	public void start() {
//		System.out.println("TestThread start() ...." + Thread.currentThread().getName());
//	}
	@Override
	public void run() {
		System.out.println("Child thread executing : " + Thread.currentThread().getName());
	}

	public void method1() {
		System.out.println("method1");
	}

	public void method2() {
		System.out.println("method2");
	}
}

class SpecialTest extends Test implements Runnable {
//	@Override
//	public void start() {
//		System.out.println("TestThread start() ...." + Thread.currentThread().getName());
//	}

	@Override
	public void run() {
		System.out.println("Child thread executing : " + Thread.currentThread().getName());
	}

	public void method1() {
		System.out.println("method1");
	}

	public void method2() {
		System.out.println("method2");
	}
}

class Test {
}
