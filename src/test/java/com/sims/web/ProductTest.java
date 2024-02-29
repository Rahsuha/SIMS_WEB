/**
 * 
 */
package com.sims.web;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class ProductTest {

	Product products = new Product();
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		products= new Product("234","Maggi","Food");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.sims.web.Product#setproductid(java.lang.String)}.
	 */
	@Test
	void testSetproductid() {
		products.setproductid("234");
		assertEquals("234",products.getproductID());
	}

	/**
	 * Test method for {@link com.sims.web.Product#getproductID()}.
	 */
	@Test
	void testGetproductID() {
		assertEquals("234",products.getproductID());
	}

	/**
	 * Test method for {@link com.sims.web.Product#setproductName(java.lang.String)}.
	 */
	@Test
	void testSetproductName() {
		products.setproductName("Maggi");
		assertEquals("Maggi",products.getProductName());
	}

	/**
	 * Test method for {@link com.sims.web.Product#getProductName()}.
	 */
	@Test
	void testGetProductName() {
		assertEquals("Maggi",products.getProductName());
	}

	/**
	 * Test method for {@link com.sims.web.Product#setproductCatalogues(java.lang.String)}.
	 */
	@Test
	void testSetproductCatalogues() {
		products.setproductCatalogues("Food");
		assertEquals("Food",products.getproductCatalogues());
	}

	/**
	 * Test method for {@link com.sims.web.Product#getproductCatalogues()}.
	 */
	@Test
	void testGetproductCatalogues() {
		assertEquals("Food",products.getproductCatalogues());
	}

}
