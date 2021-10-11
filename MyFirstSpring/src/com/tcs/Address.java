package com.tcs;

public class Address {
	private int doorNo;
	private String streetName;
	private String city, zip, state, country;

	// default constructor or No arg constructor
	public Address() {
		super();
	}

	// fully parameterised or All arguments constructor
	public Address(int doorNo, String streetName, String city, String zip, String state, String country) {
		super();
		this.doorNo = doorNo;
		this.streetName = streetName;
		this.city = city;
		this.zip = zip;
		this.state = state;
		this.country = country;
	}

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [doorNo=" + doorNo + ", streetName=" + streetName + ", city=" + city + ", zip=" + zip
				+ ", state=" + state + ", country=" + country + "]";
	}

}
