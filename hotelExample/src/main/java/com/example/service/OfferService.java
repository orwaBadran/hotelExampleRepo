package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import com.example.entities.rootObject;

@Service
public class OfferService {
	
	@Autowired
	private RestTemplate restTemplate;

	/**
	 * retrieve Offers info from Expedia offers services JSON API
	 * 
	 * @param destinationName
	 * @param lengthOfStay
	 * @param minTripStartDate
	 * @param maxTripStartDate
	 * @param minStarRating
	 * @param maxStarRating
	 * @param minTotalRate
	 * @param maxTotalRate
	 * @param minGuestRating
	 * @param maxGuestRating
	 * @return
	 */
	
	@Transactional
	public rootObject retrieveRootObject(String destinationName, String lengthOfStay, String minTripStartDate,
			String maxTripStartDate, String minStarRating, String maxStarRating, String minTotalRate,
			String maxTotalRate, String minGuestRating, String maxGuestRating) {
		
		String params = (!destinationName.isEmpty() ? "&destinationName=" + destinationName : "") +  (!lengthOfStay.isEmpty() ? "&lengthOfStay=" + lengthOfStay : "") 
				+ (!minTripStartDate.isEmpty() ? "&minTripStartDate="  + minTripStartDate : "") + (!maxTripStartDate.isEmpty() ? "&maxTripStartDate=" + maxTripStartDate : "")
				+ (!minStarRating.isEmpty() ? "&minStarRating=" + minStarRating : "") + (!maxStarRating.isEmpty() ? "&maxStarRating=" + maxStarRating : "")
				+ (!maxTotalRate.isEmpty() ? "&maxTotalRate=" + maxTotalRate : "") + (!minTotalRate.isEmpty() ? "&minTotalRate=" + minTotalRate : "")
				+ (!minGuestRating.isEmpty() ? "&minGuestRating=" + minGuestRating : "") + (!maxGuestRating.isEmpty() ? "&maxGuestRating=" + maxGuestRating : "");
		
		rootObject rootObject = restTemplate.getForObject(
				"https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel" + params,
				rootObject.class);
		
		return rootObject;
	}

}
