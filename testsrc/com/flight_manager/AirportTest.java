package com.flight_manager;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * 
 * @author Hanic Elmedin
 * @version 1.0 The Class AirportTest.
 */
public class AirportTest {

	/** The Airport test. */
	AirportTest AirportTest;

	/** The name. */
	String name;

	/** The empty name. */
	String emptyName;

	/** The greater than 5 chars. */
	String greaterThan5Chars = "asdasd";

	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {

		AirportTest = new AirportTest();
		name = "edods";
		emptyName = "";
		greaterThan5Chars = "asdasd";
	}

	/**
	 * Shoud return false when name is null.
	 */
	@Test
	public void shoudReturnFalseWhenNameIsNull() {
		boolean result = AirportTest.AirportTest(name, null);
		assertFalse(result);
	}

	/**
	 * Airport test.
	 *
	 * @param name
	 *            the name
	 * @param emptyName
	 *            the empty name
	 * @return true, if successful
	 */
	private boolean AirportTest(String name, String emptyName) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Shoud return false when empty name is empty string.
	 */
	@Test
	public void shoudReturnFalseWhenEmptyNameIsEmptyString() {
		boolean result = AirportTest.AirportTest(emptyName, null);
		assertFalse(result);
	}

}
