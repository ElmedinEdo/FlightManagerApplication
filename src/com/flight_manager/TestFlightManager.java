package com.flight_manager;

public class TestFlightManager {

	// TODO: Auto-generated Javadoc
	/**
	 * 
	 * @author Hanic Elmedin
	 * @version 1.0
	 * 
	 *          The Class TestFlightManager.
	 */

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {
		// TODO create UI
		// Start aplikacije Flight manager
		Airport airport = new Airport("Medunarodni aerodrom Tuzla: ");
		System.out.println("Aerodrom:" + airport.getName());

		Airline airline = new Airline("Wizz Air Hungary Airlines Limited ");
		System.out.println("Aviokompanija: " + airline.getName());
		System.out
				.println("...................................................");
		Flight flight = new Flight(65557, airline.name, airport.name, 6,
				"Tuzla ", "Budimpesta");
		System.out.println("Broj leta ID: " + flight.getId());
		System.out.println("Airline: " + flight.getAirline());
		System.out.println("Airport: " + flight.getAirport());
		System.out.println("Broj redova: " + flight.getSeats());

		Seat seatA = new Seat("Broj sjedista: A = ", 10, true);
		Seat seatB = new Seat("Broj sjedista: B = ", 10, true);

		Seat seatC = new Seat("Broj sjedista: C = ", 15, false);
		Seat seatD = new Seat("Broj sjedista: D = ", 15, false);

		Seat seatE = new Seat("Broj sjedista: E = ", 9, true);
		Seat seatF = new Seat("Broj sjedista: F = ", 2, true);

		System.out.println("");
		System.out.println(seatA.getRow() + seatA.getSeatNumber() + " "
				+ seatA.isAvailable());
		System.out.println(seatB.getRow() + seatB.getSeatNumber() + " "
				+ seatB.isAvailable());

		System.out.println(seatC.getRow() + seatC.getSeatNumber() + " "
				+ seatC.isAvailable());
		System.out.println(seatD.getRow() + seatD.getSeatNumber() + " "
				+ seatD.isAvailable());

		System.out.println(seatE.getRow() + seatE.getSeatNumber() + " "
				+ seatE.isAvailable());
		System.out.println(seatF.getRow() + seatF.getSeatNumber() + " "
				+ seatF.isAvailable());
		System.out
				.println("..................................................");
		System.out.println("Ukupan broj sjedista: " + 90);
		int vrijednost;
		vrijednost = seatA.getSeatNumber() + seatB.getSeatNumber()
				+ seatC.getSeatNumber() + seatD.getSeatNumber()
				+ seatE.getSeatNumber() + seatF.getSeatNumber();
		System.out.println("Ukupan broj putnika u avionu: " + vrijednost);
		System.out.print("Preostalo slobodnih mjesta: " + (90 - vrijednost));
	}
}
