package com.flight_manager;

//TODO: Auto-generated Javadoc
/**
 * 
 * @author Hanic Elmedin
 * @version 1.0 The Class Seat.
 */
public class Seat {

	/** The row. */
	// row ("A", "B", "C", "D", "E", "F")
	private String row;

	/** The seat number. */
	// seat number ex. 1,5,16
	private int seatNumber;

	/** The available. */
	// is it booked, or it is available
	private boolean available;

	/**
	 * Instantiates a new seat.
	 */
	public Seat() {

	}

	/**
	 * Instantiates a new seat.
	 *
	 * @param row
	 *            the row
	 * @param seatNumber
	 *            the seat number
	 * @param available
	 *            the available
	 */
	public Seat(String row, int seatNumber, boolean available) {
		this.row = row;
		this.seatNumber = seatNumber;
		this.available = available;
	}

	/**
	 * Gets the row.
	 *
	 * @return the row
	 */
	public String getRow() {
		return row;
	}

	/**
	 * Sets the row.
	 *
	 * @param row
	 *            the new row
	 */
	public void setRow(String row) {
		this.row = row;
	}

	/**
	 * Gets the seat number.
	 *
	 * @return the seat number
	 */
	public int getSeatNumber() {
		return seatNumber;
	}

	/**
	 * Sets the seat number.
	 *
	 * @param seatNumber
	 *            the new seat number
	 */
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	/**
	 * Checks if is available.
	 *
	 * @return true, if is available
	 */
	public boolean isAvailable() {
		return available;
	}

	/**
	 * Sets the available.
	 *
	 * @param available
	 *            the new available
	 */
	public void setAvailable(boolean available) {
		this.available = available;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Seat [row=" + row + ", seatNumber=" + seatNumber
				+ ", available=" + available + "]";
	}

}
