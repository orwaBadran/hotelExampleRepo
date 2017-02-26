package com.example.entities;

import org.joda.time.LocalDate;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.joda.deser.LocalDateDeserializer;

public class OfferDateRange {

	private int lengthOfStay;

	@JsonDeserialize(using = LocalDateDeserializer.class)
	private LocalDate travelStartDate;

	public int getLengthOfStay() {
		return this.lengthOfStay;
	}

	public void setLengthOfStay(int lengthOfStay) {
		this.lengthOfStay = lengthOfStay;
	}

	@Override
	public String toString() {
		return "OfferDateRange [lengthOfStay=" + lengthOfStay + ", travelStartDate=" + travelStartDate + "]";
	}

	public LocalDate getTravelStartDate() {
		return travelStartDate;
	}

	public void setTravelStartDate(LocalDate travelStartDate) {
		this.travelStartDate = travelStartDate;
	}
}
