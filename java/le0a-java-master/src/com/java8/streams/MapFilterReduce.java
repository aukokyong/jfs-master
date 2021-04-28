package com.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class MapFilterReduce {
	public static void main(String[] args) {
//		oldStyleIteration();
		mapping();
	}

	public static void oldStyleIteration() {
//		ArrayList integerList = new ArrayList();
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		int iVar = 1;
//		boxing is conversion of primitive to its equivalent wrapper
		Integer integer = iVar;
//		Integer integer = Integer.valueOf(i);
		integerList.add(integer);
//		integerList.add("Apple");
		integerList.add(2);
		integerList.add(20);
		integerList.add(25);
		integerList.add(12);
// oldest way
//		for(int i = 0; i<integerList.size(); i++) {
////			Integer integer2 = (Integer)integerList.get(i);
//			Integer integer2 = integerList.get(i);
//			System.out.println(integer2);
//		}
		
//		enhanced for loop
//		for (Integer integer2 : integerList) {
//			System.out.println(integer2);
//		}
		
		Iterator<Integer> iterator = integerList.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
//		drawbacks
		// 1. external iteration
//			2. sequential in nature
//			3. too much code for a little task
	}
	public static void mapping() {
//		mapping operation with streams
		String[] colorStrings = new String[] {"red","green","blue","yellow"};
//		Streams are sequence of elements 
//		Support sequential and parallel operations
//		Aggregate operations
		Stream<String> colorStream = Arrays.stream(colorStrings);
//		Map each element and modify them (using lambda expression [Function]) and return the modified value
		Stream<String> upperCaseStream = colorStream.map(color ->  color.toUpperCase());
//		:: is method reference
		String[] upperColorStrings = upperCaseStream.toArray(String[]::new);
		for(String color : upperColorStrings) {
			System.out.println(color);
		}
	}
}
