package com.flight_manager;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * 
 * @author Hanic Elmedin
 * @version 1.0 The Class SeatTest.
 */
public class SeatTest {

	/** The Seat test. */
	SeatTest SeatTest;

	/** The row. */
	String row;

	/** The seat number. */
	int seatNumber;

	/** The available. */
	boolean available;

	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {

		SeatTest = new SeatTest();
		row = "A";
		seatNumber = 6;
		available = false;
	}

	/**
	 * Shoud return false when row input.
	 */
	@Test
	public void shoudReturnFalseWhenRowInput() {
		boolean result = SeatTest.equals(getRow("A"));
		assertFalse(result);
	}

	/**
	 * Gets the row.
	 *
	 * @param string
	 *            the string
	 * @return the row
	 */
	private Object getRow(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Shoud return false when seat number input.
	 */
	@Test
	public void shoudReturnFalseWhenSeatNumberInput() {
		boolean result = SeatTest.equals(getSeatNumber(6));
		assertFalse(result);
	}

	/**
	 * Gets the seat number.
	 *
	 * @param i
	 *            the i
	 * @return the seat number
	 */
	private Object getSeatNumber(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Shoud return false when available input.
	 */
	@Test
	public void shoudReturnFalseWhenAvailableInput() {
		boolean result = SeatTest.equals(getAvailable(false));
		assertFalse(result);
	}

	/**
	 * Gets the available.
	 *
	 * @param b
	 *            the b
	 * @return the available
	 */
	private Object getAvailable(boolean b) {
		// TODO Auto-generated method stub
		return null;
	}
}
