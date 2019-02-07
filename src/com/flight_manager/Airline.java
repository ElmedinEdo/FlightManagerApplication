package com.flight_manager;

//TODO: Auto-generated Javadoc
/**
 * @author Hanic Elmedin
 * @version 1.0
 * 
 * 
 *          The Class Airline.
 */
public class Airline {

	/** The name. */
	public String name;

	/**
	 * Instantiates a new airline.
	 */
	public Airline() {

	}

	/**
	 * Instantiates a new airline.
	 *
	 * @param name
	 *            the name
	 */
	public Airline(String name) {
		this.name = name;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Airline [name=" + name + "]";
	}

	/**
	 * Airline test.
	 *
	 * @param name
	 *            the name
	 * @param emptyName
	 *            the empty name
	 * @param greaterThan5Chars
	 *            the greater than 5 chars
	 * @return true, if successful
	 */
	public boolean AirlineTest(String name, String emptyName,
			String greaterThan5Chars) {

		if (name == null || emptyName == null) {
			return false;
		} else if (name.equals("") || emptyName.equals("")) {
			return false;
		} else if (greaterThan5Chars.length() < 5) {
			return true;
		} else {

			return false;
		}

	}
}
