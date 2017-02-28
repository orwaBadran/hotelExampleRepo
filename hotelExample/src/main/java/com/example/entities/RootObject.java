package com.example.entities;

public class RootObject {
	private OfferInfo offerInfo;

	private UserInfo userInfo;
	
	private Offer offers;

	public OfferInfo getOfferInfo() {
		return this.offerInfo;
	}

	public void setOfferInfo(OfferInfo offerInfo) {
		this.offerInfo = offerInfo;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Offer getOffers() {
		return this.offers;
	}

	public void setOffers(Offer offers) {
		this.offers = offers;
	}

	@Override
	public String toString() {
		return "RootObject [offerInfo=" + offerInfo + ", userInfo=" + userInfo + ", offer=" + offers + "]";
	}
}