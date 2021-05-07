package com.domain;

public class App {
	public static void main(String[] args) {
		Cart generalCart = new Cart("1", "General");
		Cart dealCart = new Cart("2", "Deal");

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
