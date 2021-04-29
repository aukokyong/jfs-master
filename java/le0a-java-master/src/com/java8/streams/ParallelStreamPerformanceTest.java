package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ParallelStreamPerformanceTest {
	public static void main(String[] args) {
		serialStreamPerformance(10000000);
		parallelStreamPerformance(10000000);
//		serialStreamPerformance(1000000);
//		parallelStreamPerformance(1000000);
	}

	private static void serialStreamPerformance(int count) {
		// Set up the collection with data
		List<Integer> productList = new ArrayList<Integer>();
		productList.add(1000);
		for (int i = 0; i < count ; i++) {
			Integer lastvalue = productList.get(i);
			productList.add(lastvalue + 1000);
		}

//		System.out.println("Input List --> " + productList);
		long start = System.nanoTime();
		List<Integer> serialProductList = new ArrayList<Integer>();
		Stream<Integer> productListStream = productList.stream();
		Stream<Integer> productListFilteredStream = productListStream.filter(product -> product > 3000);
		productListFilteredStream.forEach((product) -> {
//		System.out.println("Thread Name --> " + Thread.currentThread().getName());
//			serialProductList.add(product);
		});
		long finish = System.nanoTime();
		long timeElapsed = finish - start;
		System.out.println("SP" + timeElapsed);
		//System.out.println("Serial List " + serialProductList);
	}
	private static void parallelStreamPerformance(int count) {
		// Set up the collection with data
		List<Integer> productList = new ArrayList<Integer>();
		productList.add(1000);
		for (int i = 0; i < count; i++) {
			Integer lastvalue = productList.get(i);
			productList.add(lastvalue + 1000);
		}

//		System.out.println("Input List --> " + productList);
		long start = System.nanoTime();
		List<Integer> parallelProductList = new ArrayList<Integer>();
		Stream<Integer> productListStream = productList.parallelStream();
		Stream<Integer> productListFilteredStream = productListStream.filter(product -> product > 3000);
		productListFilteredStream.forEach((product) -> {
//		System.out.println("Thread Name --> " + Thread.currentThread().getName());
//			parallelProductList .add(product);
		});
		long finish = System.nanoTime();
		long timeElapsed = finish - start;
		System.out.println("PP" + timeElapsed);
		//System.out.println("Parallel List " + serialProductList);
	}
}


