package com.example.entities;

public class OfferInfo {
	
	private String siteID;

	private String language;
	
	private String currency;

	public String getSiteID() {
		return this.siteID;
	}

	public void setSiteID(String siteID) {
		this.siteID = siteID;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@Override
	public String toString() {
		return "OfferInfo [siteID=" + siteID + ", language=" + language + ", currency=" + currency + "]";
	}
}
