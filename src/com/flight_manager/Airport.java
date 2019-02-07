package com.flight_manager;

// TODO: Auto-generated Javadoc
/**
 * 
 * @author Hanic Elmedin
 * @version 1.0 The Class Airport.
 */
public class Airport {

	/** The name. */
	public String name;

	/**
	 * Instantiates a new airport.
	 */
	public Airport() {

	}

	/**
	 * Instantiates a new airport.
	 *
	 * @param name
	 *            the name
	 */
	public Airport(String name) {
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
	 *            the name
	 * @return true, if successful
	 */
	public boolean setName(String name) {
		this.name = name;
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Airport [name=" + name + "]";
	}

	/**
	 * Airport.
	 *
	 * @param name
	 *            the name
	 * @param emptyName
	 *            the empty name
	 * @param greaterThan5Chars
	 *            the greater than 5 chars
	 * @return true, if successful
	 */
	public boolean Airport(String name, String emptyName,
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
