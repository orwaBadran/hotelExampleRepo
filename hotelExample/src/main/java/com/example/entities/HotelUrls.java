package com.example.entities;

public class HotelUrls {
	
	private String hotelInfositeUrl;

	private String hotelSearchResultUrl;

	public String getHotelInfositeUrl() {
		return this.hotelInfositeUrl;
	}

	public void setHotelInfositeUrl(String hotelInfositeUrl) {
		this.hotelInfositeUrl = hotelInfositeUrl;
	}

	public String getHotelSearchResultUrl() {
		return this.hotelSearchResultUrl;
	}

	public void setHotelSearchResultUrl(String hotelSearchResultUrl) {
		this.hotelSearchResultUrl = hotelSearchResultUrl;
	}

	@Override
	public String toString() {
		return "HotelUrls [hotelInfositeUrl=" + hotelInfositeUrl + ", hotelSearchResultUrl=" + hotelSearchResultUrl
				+ "]";
	}
}