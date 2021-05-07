package com.domain;

 import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
	
	@Test
	public void testGeneralCartGeneralProduct() {
		Cart generalCart = new GeneralCart("1");
		Product spring = new Product("Spring", false);
//		Assertions.assertEquals("1", generalCart.getId());
		assertEquals("1", generalCart.getId());
		assertNotEquals("2", generalCart.getId());
		assertEquals(true, generalCart.addProduct(spring));
		assertEquals(1, generalCart.getProductsList().size());
		assertEquals("Spring",generalCart.getProductsList().get(0).getName());
	}
	@Test
	public void testGeneralCartOnDealProduct() {
		Cart generalCart = new GeneralCart("1");
		Product java = new Product("Java", true);
//		Assertions.assertEquals("1", generalCart.getId());
		assertEquals("1", generalCart.getId());
		assertEquals(true, generalCart.addProduct(java));
		assertEquals(1, generalCart.getProductsList().size());
		assertEquals("Java",generalCart.getProductsList().get(0).getName());
	}
	
	@Test
	public void testDealCartOnGeneralProduct() {
		Cart dealCart = new DealCart("2");
		Product spring = new Product("Spring", false);
		assertEquals(false, dealCart.addProduct(spring));
//		Product java = new Product("Java", true);
//		Assertions.assertEquals("1", generalCart.getId());
//		assertEquals("1", dealCart.getId());
//		assertEquals(true, dealCart.addProduct(java));
//		assertEquals(1, dealCart.getProductsList().size());
//		assertEquals("Java",dealCart.getProductsList().get(0).getName());
	}
}
