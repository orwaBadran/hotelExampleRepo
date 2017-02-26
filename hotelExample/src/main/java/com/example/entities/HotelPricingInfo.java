package com.example.entities;

public class HotelPricingInfo {
	
	private double averagePriceValue;

	private double totalPriceValue;
	
	private String originalPricePerNight;
	
	private double hotelTotalBaseRate;
	
	private double hotelTotalTaxesAndFees;
	
	private String currency;
	
	private double hotelTotalMandatoryTaxesAndFees;
	
	private double percentSavings;
	
	private boolean drr;

	public double getAveragePriceValue() {
		return this.averagePriceValue;
	}

	public void setAveragePriceValue(double averagePriceValue) {
		this.averagePriceValue = averagePriceValue;
	}

	public double getTotalPriceValue() {
		return this.totalPriceValue;
	}

	public void setTotalPriceValue(double totalPriceValue) {
		this.totalPriceValue = totalPriceValue;
	}

	public String getOriginalPricePerNight() {
		return this.originalPricePerNight;
	}

	public void setOriginalPricePerNight(String originalPricePerNight) {
		this.originalPricePerNight = originalPricePerNight;
	}

	public double getHotelTotalBaseRate() {
		return this.hotelTotalBaseRate;
	}

	public void setHotelTotalBaseRate(double hotelTotalBaseRate) {
		this.hotelTotalBaseRate = hotelTotalBaseRate;
	}

	public double getHotelTotalTaxesAndFees() {
		return this.hotelTotalTaxesAndFees;
	}

	public void setHotelTotalTaxesAndFees(double hotelTotalTaxesAndFees) {
		this.hotelTotalTaxesAndFees = hotelTotalTaxesAndFees;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public double getHotelTotalMandatoryTaxesAndFees() {
		return this.hotelTotalMandatoryTaxesAndFees;
	}

	public void setHotelTotalMandatoryTaxesAndFees(double hotelTotalMandatoryTaxesAndFees) {
		this.hotelTotalMandatoryTaxesAndFees = hotelTotalMandatoryTaxesAndFees;
	}

	public double getPercentSavings() {
		return this.percentSavings;
	}

	public void setPercentSavings(double percentSavings) {
		this.percentSavings = percentSavings;
	}

	public boolean getDrr() {
		return this.drr;
	}

	public void setDrr(boolean drr) {
		this.drr = drr;
	}

	@Override
	public String toString() {
		return "HotelPricingInfo [averagePriceValue=" + averagePriceValue + ", totalPriceValue=" + totalPriceValue
				+ ", originalPricePerNight=" + originalPricePerNight + ", hotelTotalBaseRate=" + hotelTotalBaseRate
				+ ", hotelTotalTaxesAndFees=" + hotelTotalTaxesAndFees + ", currency=" + currency
				+ ", hotelTotalMandatoryTaxesAndFees=" + hotelTotalMandatoryTaxesAndFees + ", percentSavings="
				+ percentSavings + ", drr=" + drr + "]";
	}
}