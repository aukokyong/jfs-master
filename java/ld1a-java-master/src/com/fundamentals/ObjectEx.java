package com.fundamentals;

public class ObjectEx extends Object{
	public static void main(String[] args) {
		Test test = new Test();
		String testString = test.toString();
		System.out.println(testString);
		String className = testString.getClass().getName();
		System.out.println(className);
		String className1 = test.getClass().getName();
		System.out.println(className1);
	}
}
class Test extends Object{
	
}
