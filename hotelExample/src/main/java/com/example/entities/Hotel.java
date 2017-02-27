package com.example.entities;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Hotel {
	
	private OfferDateRange offerDateRange;

	private Destination destination;
	
	private HotelInfo hotelInfo;
	
	private HotelUrgencyInfo hotelUrgencyInfo;
	
	private HotelPricingInfo hotelPricingInfo;
	
	private HotelUrls hotelUrls;
	
	private HotelScore hotelScores;
	
	
	@JsonCreator
	public Hotel(@JsonProperty("offerDateRange") OfferDateRange offerDateRange, @JsonProperty("destination") Destination destination, @JsonProperty("hotelInfo") HotelInfo hotelInfo,
			@JsonProperty("hotelUrgencyInfo") HotelUrgencyInfo hotelUrgencyInfo, @JsonProperty("hotelPricingInfo") HotelPricingInfo hotelPricingInfo, @JsonProperty("hotelUrls") HotelUrls hotelUrls,
			@JsonProperty("hotelScores") HotelScore hotelScores) {
		super();
		this.offerDateRange = offerDateRange;
		this.destination = destination;
		this.hotelInfo = hotelInfo;
		this.hotelUrgencyInfo = hotelUrgencyInfo;
		this.hotelPricingInfo = hotelPricingInfo;
		this.hotelUrls = hotelUrls;
		this.hotelScores = hotelScores;
	}

	public OfferDateRange getOfferDateRange() {
		return this.offerDateRange;
	}

	public void setOfferDateRange(OfferDateRange offerDateRange) {
		this.offerDateRange = offerDateRange;
	}

	public Destination getDestination() {
		return this.destination;
	}

	public void setDestination(Destination destination) {
		this.destination = destination;
	}

	public HotelInfo getHotelInfo() {
		return this.hotelInfo;
	}

	public void setHotelInfo(HotelInfo hotelInfo) {
		this.hotelInfo = hotelInfo;
	}

	public HotelUrgencyInfo getHotelUrgencyInfo() {
		return this.hotelUrgencyInfo;
	}

	public void setHotelUrgencyInfo(HotelUrgencyInfo hotelUrgencyInfo) {
		this.hotelUrgencyInfo = hotelUrgencyInfo;
	}

	public HotelPricingInfo getHotelPricingInfo() {
		return this.hotelPricingInfo;
	}

	public void setHotelPricingInfo(HotelPricingInfo hotelPricingInfo) {
		this.hotelPricingInfo = hotelPricingInfo;
	}

	public HotelUrls getHotelUrls() {
		return this.hotelUrls;
	}

	public void setHotelUrls(HotelUrls hotelUrls) {
		this.hotelUrls = hotelUrls;
	}

	public HotelScore getHotelScores() {
		return this.hotelScores;
	}

	public void setHotelScores(HotelScore hotelScores) {
		this.hotelScores = hotelScores;
	}

	@Override
	public String toString() {
		return "Hotel [offerDateRange=" + offerDateRange + ", destination=" + destination + ", hotelInfo=" + hotelInfo
				+ ", hotelUrgencyInfo=" + hotelUrgencyInfo + ", hotelPricingInfo=" + hotelPricingInfo + ", hotelUrls="
				+ hotelUrls + ", hotelScores=" + hotelScores + "]";
	}
}