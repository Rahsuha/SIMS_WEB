/**
 * 
 */
package com.sims.web;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



/**
 * 
 */
class StaffTest {
//	private ArrayList<Staff> staffs= new ArrayList<>();
	private Staff staff = new Staff();
	private Staff sc;
	private Staff s1;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	
		staff = new Staff("Darly","2345","darly@gmail.com");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.sims.web.Staff#setName(java.lang.String)}.
	 */
	@Test
	void testSetName() {
staff.setName("Darly");
assertEquals("Darly", staff.getName());
	}

	/**
	 * Test method for {@link com.sims.web.Staff#getName()}.
	 */
	@Test
	void testGetName() {
		assertEquals("Darly",staff.getName());
	}

	/**
	 * Test method for {@link com.sims.web.Staff#setPassword(java.lang.String)}.
	 */
	@Test
	void testSetPassword() {
		staff.setPassword("2345");
		assertEquals("2345", staff.getPassword());
	}

	/**
	 * Test method for {@link com.sims.web.Staff#getPassword()}.
	 */
	@Test
	void testGetPassword() {
		assertEquals("2345",staff.getPassword());
	}

	/**
	 * Test method for {@link com.sims.web.Staff#setEmail(java.lang.String)}.
	 */
	@Test
	void testSetEmail() {
		staff.setEmail("darly@gmail.com");
		assertEquals("darly@gmail.com", staff.getEmail());
	}

	/**
	 * Test method for {@link com.sims.web.Staff#getEmail()}.
	 */
	@Test
	void testGetEmail() {
		assertEquals("darly@gmail.com",staff.getEmail());
	}

}
