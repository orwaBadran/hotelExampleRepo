package com.example.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Offers {
	
	@JsonProperty
	private List<Hotel> Hotel;
	

	public List<Hotel> getHotel() {
		return this.Hotel;
	}

	public void setHotel(List<Hotel> Hotel) {
		this.Hotel = Hotel;
	}

	@Override
	public String toString() {
		return "Offers [Hotel=" + Hotel + "]";
	}
}