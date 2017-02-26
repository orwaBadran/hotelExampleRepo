package com.example.entities;

public class Destination {
	
	private String regionID;

	private String longName;
	
	private String country;
	
	private String province;
	
	private String city;

	public String getRegionID() {
		return this.regionID;
	}

	public void setRegionID(String regionID) {
		this.regionID = regionID;
	}

	public String getLongName() {
		return this.longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Destination [regionID=" + regionID + ", longName=" + longName + ", country=" + country + ", province="
				+ province + ", city=" + city + "]";
	}
}
