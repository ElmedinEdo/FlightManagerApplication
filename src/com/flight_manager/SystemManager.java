package com.flight_manager;

import java.util.List;

//TODO: Auto-generated Javadoc
/**
 * 
 * @author Hanic Elmedin
 * @version 1.0
 * 
 *          The Class SystemManager.
 */
public class SystemManager {

	/** The list of airports. */
	private List<Airport> listOfAirports;

	/** The list of flights. */
	private List<Flight> listOfFlights;

	/** The list of airlines. */
	private List<Airline> listOfAirlines;

	/** The list of seats. */
	private List<Seat> listOfSeats;

	/**
	 * Creates the airport.
	 *
	 * @param name
	 *            the name
	 * @return the airport
	 */
	public Airport createAirport(String name) {
		// kreiran aerodrom
		Airport airport = new Airport();
		listOfAirports.add(airport);
		return airport;
	}

	/**
	 * Creates the airline.
	 *
	 * @param name
	 *            the name
	 * @return the airline
	 */
	public Airline createAirline(String name) {
		// kreiran airline
		Airline airline = new Airline();
		listOfAirlines.add(airline);
		return airline;
	}

	/**
	 * Creates the flight.
	 *
	 * @param name
	 *            the name
	 * @param origin
	 *            the origin
	 * @param destination
	 *            the destination
	 * @param id
	 *            the id
	 * @return the flight
	 */
	public boolean createFlight(String name, String origin, String destination,
			Integer id) {
		// TODO kreiran let
		Flight flight = new Flight();
		listOfFlights.add(flight);
		return false;
	}

	/**
	 * Creates the seats.
	 *
	 * @param airline
	 *            the airline
	 * @param flightID
	 *            the flight ID
	 * @param numberOfSeatsPerRow
	 *            the number of seats per row
	 */
	public void createSeats(String airline, Integer flightID,
			Integer numberOfSeatsPerRow) {
		// TODO kreirana sjedista
		Seat seats = new Seat();
		listOfSeats.add(seats);
	}

	/**
	 * Find available flights.
	 *
	 * @param origin
	 *            the origin
	 * @param destination
	 *            the destination
	 * @return the list
	 */
	public List<Flight> findAvailableFlights(String origin, String destination) {
		// TODO kreiran
		Flight findAvailableFlights = new Flight();
		listOfFlights.add(findAvailableFlights);
		return listOfFlights;
	}

	/**
	 * Book seat.
	 *
	 * @param airline
	 *            the airline
	 * @param flightName
	 *            the flight name
	 * @param seatNumber
	 *            the seat number
	 * @param row
	 *            the row
	 * @return true, if successful
	 */
	public boolean bookSeat(String airline, String flightName, int seatNumber,
			String row) {
		// TODO bookSeat kreiran
		Seat bookSeat = new Seat();
		listOfSeats.add(bookSeat);
		return true;

	}

}
