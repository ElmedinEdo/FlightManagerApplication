package com.flight_manager;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * @author Hanic Elmedin
 * @version 1.0 The Class FlightTest.
 */
public class FlightTest {

	/** The Flight test. */
	FlightTest FlightTest;

	/** The empty id. */
	int id, emptyId;

	/** The empty airline. */
	String airline, emptyAirline;

	/** The empty airport. */
	String airport, emptyAirport;

	/** The empty seats. */
	int seats, emptySeats;

	/** The empty origin. */
	String origin, emptyOrigin;

	/** The empty destination. */
	String destination, emptyDestination;

	/** The greater than 5 chars. */
	String greaterThan5Chars = "asdasd";

	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {

		FlightTest = new FlightTest();
		id = 80;
		emptyId = 0;
		airline = "airline";
		emptyAirline = "";
		airport = "airport";
		emptyAirport = "";
		greaterThan5Chars = "asdasd";
		seats = 0;
		emptySeats = 0;
		origin = "Tuzlaaa";
		emptyOrigin = "";
		destination = "Budimpesta";
		emptyDestination = "";

	}

	/**
	 * Should return false when input id.
	 */
	@Test
	public void shouldReturnFalseWhenInputId() {
		boolean result = FlightTest.equals(getId(80));
		assertFalse(result);
	}

	/**
	 * Gets the id.
	 *
	 * @param i
	 *            the i
	 * @return the id
	 */
	private Object getId(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Should return false when input seats.
	 */
	@Test
	public void shouldReturnFalseWhenInputSeats() {
		boolean result = FlightTest.equals(getSeats(90));
		assertFalse(result);
	}

	/**
	 * Gets the seats.
	 *
	 * @param i
	 *            the i
	 * @return the seats
	 */
	private Object getSeats(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Should return false when input airplane.
	 */
	@Test
	public void shouldReturnFalseWhenInputAirplane() {
		boolean result = FlightTest.equals(getAirplane("Airplane"));
		assertFalse(result);
	}

	/**
	 * Gets the airplane.
	 *
	 * @param string
	 *            the string
	 * @return the airplane
	 */
	private Object getAirplane(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Should return false when input airport.
	 */
	@Test
	public void shouldReturnFalseWhenInputAirport() {
		boolean result = FlightTest.equals(getAirport("Airport"));
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
	 * Should return false when input origin.
	 */
	@Test
	public void shouldReturnFalseWhenInputOrigin() {
		boolean result = FlightTest.equals(getOrigin("Origin"));
		assertFalse(result);
	}

	/**
	 * Gets the origin.
	 *
	 * @param string
	 *            the string
	 * @return the origin
	 */
	private Object getOrigin(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Should return false when input destination.
	 */
	@Test
	public void shouldReturnFalseWhenInputDestination() {
		boolean result = FlightTest.equals(getDestination("Destination"));
		assertFalse(result);
	}

	/**
	 * Gets the destination.
	 *
	 * @param string
	 *            the string
	 * @return the destination
	 */
	private Object getDestination(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
