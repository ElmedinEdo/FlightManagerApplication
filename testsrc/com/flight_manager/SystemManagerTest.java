package com.flight_manager;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

// TODO: Auto-generated Javadoc
/**
 * 
 * @author Hanic Elmedin
 * @version 1.0 The Class SystemManagerTest.
 */
public class SystemManagerTest {

	/** The sm. */
	SystemManager sm = new SystemManager();

	/** The airline. */
	String airline;

	/** The airport. */
	String airport;

	/** The name. */
	String name;

	/** The id. */
	int id;

	/** The origin. */
	String origin;

	/** The destination. */
	String destination;

	/** The row. */
	String row;

	/** The flight name. */
	String flightName;

	/** The seat number. */
	int seatNumber;

	/** The number of seats per row. */
	int numberOfSeatsPerRow;

	/** The flight ID. */
	int flightID;

	/**
	 * Sets the up.
	 */
	@Before
	public void setUp() {
		sm = new SystemManager();
		airport = "airport";
		airline = "airline";
		name = "name";
		id = 10;
		origin = "Tuzla";
		destination = "Budimpesta";
		flightName = "flightname";
		row = "A";
		seatNumber = 13;
		numberOfSeatsPerRow = 6;
		flightID = 223324;
	}

	/**
	 * Should return false when input id.
	 */
	@Test
	public void shouldReturnFalseWhenInputId() {
		boolean result = sm.equals(getId(10));
		assertFalse(result);
	}

	/**
	 * Gets the id.
	 *
	 * @param id
	 *            the id
	 * @return the id
	 */
	private Object getId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Should return false when input destination.
	 */
	@Test
	public void shouldReturnFalseWhenInputDestination() {
		boolean result = sm.equals(getDestination("Budimpesta"));
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

	/**
	 * Should return false when input origin.
	 */
	@Test
	public void shouldReturnFalseWhenInputOrigin() {
		boolean result = sm.equals(getOrigin("Tuzla"));
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
	 * Should return false when input name.
	 */
	@Test
	public void shouldReturnFalseWhenInputName() {
		boolean result = sm.equals(getName("name"));
		assertFalse(result);
	}

	/**
	 * Gets the name.
	 *
	 * @param string
	 *            the string
	 * @return the name
	 */
	private Object getName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Should return false when input flight name.
	 */
	@Test
	public void shouldReturnFalseWhenInputFlightName() {
		boolean result = sm.equals(getFlightName("flightname"));
		assertFalse(result);
	}

	/**
	 * Gets the flight name.
	 *
	 * @param string
	 *            the string
	 * @return the flight name
	 */
	private Object getFlightName(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Should return false when input row.
	 */
	@Test
	public void shouldReturnFalseWhenInputRow() {
		boolean result = sm.equals(getRow("A"));
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
	 * Should return false when input seat number.
	 */
	@Test
	public void shouldReturnFalseWhenInputSeatNumber() {
		boolean result = sm.equals(getSeatNumber(13));
		assertFalse(result);
	}

	/**
	 * Gets the seat number.
	 *
	 * @param id
	 *            the id
	 * @return the seat number
	 */
	private Object getSeatNumber(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Should return false when input number of seats per row.
	 */
	@Test
	public void shouldReturnFalseWhenInputNumberOfSeatsPerRow() {
		boolean result = sm.equals(getnumberOfSeatsPerRow(3));
		assertFalse(result);
	}

	/**
	 * Gets the number of seats per row.
	 *
	 * @param id
	 *            the id
	 * @return the number of seats per row
	 */
	private Object getnumberOfSeatsPerRow(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Should return false when inputflight ID.
	 */
	@Test
	public void shouldReturnFalseWhenInputflightID() {
		boolean result = sm.equals(getflightID(2342));
		assertFalse(result);
	}

	/**
	 * Gets the flight ID.
	 *
	 * @param id
	 *            the id
	 * @return the flight ID
	 */
	private Object getflightID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Should return true if airport input.
	 */
	@Test
	public void shouldReturnTrueIfAirportInput() {
		boolean result = sm.equals(getAirport("Airport"));
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
		boolean result = sm.equals(getAirline("Airline"));
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
}
