package com.domain;

public class App {
	public static void main(String[] args) {
		Cart generalCart = new GeneralCart("1");
		Cart dealCart = new DealCart("2");

		Product java = new Product("Java", true);
		Product spring = new Product("Spring", false);

		dealCart.addProduct(java);
		dealCart.addProduct(spring);
		generalCart.addProduct(spring);

		System.out.println("General Cart Products");
//		Lambda expressions
		generalCart.getProductsList().forEach((product) -> {
			System.out.println(product);
		});
		generalCart.getProductsList().forEach(product -> System.out.println(product));

		System.out.println("Deal Cart Products");
//		Method reference
		dealCart.getProductsList().forEach(System.out::println);
	}
}
