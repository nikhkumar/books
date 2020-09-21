package com.mybook.books.model;

public enum Country {
	
	INDIA("India"), FRN("France"), CHN("China"), USA("United States of America"),
	PAK("Pakistan"), UK("United Kingdom"), CAN("Canada");

	private String name;

	private Country(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
}
