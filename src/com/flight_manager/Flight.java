package com.flight_manager;

//TODO: Auto-generated Javadoc
/**
 * 
 * @author Hanic Elmedin
 * @version 1.0
 * 
 *          The Class Flight.
 */
public class Flight {

	/** The id. */
	// unique ID
	private int id;

	/** The airline. */
	// which airline owns this flight
	private String airline;

	/** The airport. */
	// from which airport flight takes of
	private String airport;

	/** The seats. */
	// all seats in this flight
	private int seats;

	/** The origin. */
	// city where it takes off from
	private String origin;

	/** The destination. */
	// city where the flight is going
	private String destination;

	/**
	 * Instantiates a new flight.
	 */
	public Flight() {

	}

	/**
	 * Instantiates a new flight.
	 *
	 * @param id
	 *            the id
	 * @param airline
	 *            the airline
	 * @param airport
	 *            the airport
	 * @param seats
	 *            the seats
	 * @param origin
	 *            the origin
	 * @param destination
	 *            the destination
	 */
	public Flight(int id, String airline, String airport, int seats,
			String origin, String destination) {
		this.id = id;
		this.airline = airline;
		this.airport = airport;
		this.seats = seats;
		this.origin = origin;
		this.destination = destination;
	}

	/**
	 * Gets the airline.
	 *
	 * @return the airline
	 */
	public String getAirline() {
		return airline;
	}

	/**
	 * Sets the airline.
	 *
	 * @param airline
	 *            the new airline
	 */
	public void setAirline(String airline) {
		this.airline = airline;
	}

	/**
	 * Gets the airport.
	 *
	 * @return the airport
	 */
	public String getAirport() {
		return airport;
	}

	/**
	 * Sets the airport.
	 *
	 * @param airport
	 *            the new airport
	 */
	public void setAirport(String airport) {
		this.airport = airport;
	}

	/**
	 * Gets the seats.
	 *
	 * @return the seats
	 */
	public int getSeats() {
		return seats;
	}

	/**
	 * Sets the seats.
	 *
	 * @param seats
	 *            the new seats
	 */
	public void setSeats(int seats) {
		this.seats = seats;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id
	 *            the new id
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * Gets the origin.
	 *
	 * @return the origin
	 */
	public String getOrigin() {
		return origin;
	}

	/**
	 * Sets the origin.
	 *
	 * @param origin
	 *            the new origin
	 */
	public void setOrigin(String origin) {
		this.origin = origin;
	}

	/**
	 * Gets the destination.
	 *
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * Sets the destination.
	 *
	 * @param destination
	 *            the new destination
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Flight [id=" + id + ", airline=" + airline + ", airport="
				+ airport + ", seats=" + seats + ", origin=" + origin
				+ ", destination=" + destination + "]";

	}
}
