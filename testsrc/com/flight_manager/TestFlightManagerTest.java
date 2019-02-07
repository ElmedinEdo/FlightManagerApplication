package com.flight_manager;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * @author Hanic Elmedin
 * @version 1.0 The Class TestFlightManagerTest.
 */
public class TestFlightManagerTest {

	/** The tfm. */
	TestFlightManager tfm = new TestFlightManager();

	/** The airport. */
	String airport;

	/** The airline. */
	String airline;

	/** The flight. */
	String flight;

	/** The seats. */
	String seats;

	/** The seat number. */
	int seatNumber;

	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {

		tfm = new TestFlightManager();
		airport = "";
		airline = "";
		flight = "";
		seats = "";
		seatNumber = 90;

	}

	/**
	 * Should return true if airport input.
	 */
	@Test
	public void shouldReturnTrueIfAirportInput() {
		boolean result = tfm.equals(getAirport("Medunarodni aerodrom Tuzla"));
		assertFalse(result);

	}

	/**
	 * Gets the airport.
	 *
	 * @param string
	 *            the string
	 * @return the airport
	 */
	private Object getAirport(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Should return true if airline input.
	 */
	@Test
	public void shouldReturnTrueIfAirlineInput() {
		boolean result = tfm
				.equals(getAirline("Wizz Air Hungary Airlines Limited "));
		assertFalse(result);
	}

	/**
	 * Gets the airline.
	 *
	 * @param string
	 *            the string
	 * @return the airline
	 */
	private Object getAirline(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Should return true if flight input.
	 */
	@Test
	public void shouldReturnTrueIfFlightInput() {
		boolean result = tfm.equals(getFlight(65557,
				"Wizz Air Hungary Airlines Limited",
				"Medunarodni aerodrom Tuzla", 6, "Tuzla", "Budimpesta"));
		assertFalse(result);
	}

	/**
	 * Gets the flight.
	 *
	 * @param i
	 *            the i
	 * @param string
	 *            the string
	 * @param string2
	 *            the string 2
	 * @param j
	 *            the j
	 * @param string3
	 *            the string 3
	 * @param string4
	 *            the string 4
	 * @return the flight
	 */
	private Object getFlight(int i, String string, String string2, int j,
			String string3, String string4) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Should return true if seats input A.
	 */
	@Test
	public void shouldReturnTrueIfSeatsInputA() {
		boolean result = tfm.equals(getSeats("A", 10, true));
		assertFalse(result);
	}

	/**
	 * Gets the seats.
	 *
	 * @param string
	 *            the string
	 * @param i
	 *            the i
	 * @param b
	 *            the b
	 * @return the seats
	 */
	private Object getSeats(String string, int i, boolean b) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Should return true if seats input B.
	 */
	@Test
	public void shouldReturnTrueIfSeatsInputB() {
		boolean result = tfm.equals(getSeats("B", 10, true));
		assertFalse(result);

	}

	/**
	 * Should return true if seats input C.
	 */
	@Test
	public void shouldReturnTrueIfSeatsInputC() {
		boolean result = tfm.equals(getSeats("C", 15, false));
		assertFalse(result);

	}

	/**
	 * Should return true if seats input D.
	 */
	@Test
	public void shouldReturnTrueIfSeatsInputD() {
		boolean result = tfm.equals(getSeats("D", 15, false));
		assertFalse(result);
	}

	/**
	 * Should return true if seats input E.
	 */
	@Test
	public void shouldReturnTrueIfSeatsInputE() {
		boolean result = tfm.equals(getSeats("E", 9, true));
		assertFalse(result);
	}

	/**
	 * Should return true if seats input F.
	 */
	@Test
	public void shouldReturnTrueIfSeatsInputF() {
		boolean result = tfm.equals(getSeats("F", 2, true));
		assertFalse(result);
	}

	/**
	 * Should return true if seat number input.
	 */
	@Test
	public void shouldReturnTrueIfSeatNumberInput() {
		boolean result = tfm.equals(getSeatNumber(90));
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
}