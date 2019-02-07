package com.flight_manager;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * 
 * @author Hanic Elmedin
 * @version 1.0 The Class AirlineTest.
 */
public class AirlineTest {

	/** The Airline test. */
	AirlineTest AirlineTest;

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

		AirlineTest = new AirlineTest();
		name = "as";
		emptyName = "";
		greaterThan5Chars = "asdas";
	}

	/**
	 * Shoud return false when name is null.
	 */
	@Test
	public void shoudReturnFalseWhenNameIsNull() {
		boolean result = AirlineTest.AirlineTest(name, null);
		assertFalse(result);
	}

	/**
	 * Airline test.
	 *
	 * @param name
	 *            the name
	 * @param emptyName
	 *            the empty name
	 * @return true, if successful
	 */
	private boolean AirlineTest(String name, String emptyName) {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * Shoud return false when empty name is empty string.
	 */
	@Test
	public void shoudReturnFalseWhenEmptyNameIsEmptyString() {
		boolean result = AirlineTest.AirlineTest(emptyName, null);
		assertFalse(result);
	}

}
