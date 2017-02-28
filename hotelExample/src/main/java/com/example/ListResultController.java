package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.entities.RootObject;

@Controller
public class ListResultController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/listResult")
	public ModelAndView listResult(@RequestParam(required = false, defaultValue = "") String destinationName, @RequestParam(required = false, defaultValue = "") String lengthOfStay,
			@RequestParam(required = false, defaultValue = "") String minTripStartDate, @RequestParam(required = false, defaultValue = "") String maxTripStartDate,
			@RequestParam(required = false, defaultValue = "") String minStarRating, @RequestParam(required = false, defaultValue = "") String maxStarRating, 
			@RequestParam(required = false, defaultValue = "") String minTotalRate, @RequestParam(required = false, defaultValue = "") String maxTotalRate, 
			@RequestParam(required = false, defaultValue = "") String minGuestRating, @RequestParam(required = false, defaultValue = "") String maxGuestRating) {

		String params = (!destinationName.isEmpty() ? "&destinationName=" + destinationName : "") +  (!lengthOfStay.isEmpty() ? "&lengthOfStay=" + lengthOfStay : "") 
				+ (!minTripStartDate.isEmpty() ? "&minTripStartDate="  + minTripStartDate : "") + (!maxTripStartDate.isEmpty() ? "&maxTripStartDate=" + maxTripStartDate : "")
				+ (!minStarRating.isEmpty() ? "&minStarRating=" + minStarRating : "") + (!maxStarRating.isEmpty() ? "&maxStarRating=" + maxStarRating : "")
				+ (!maxTotalRate.isEmpty() ? "&maxTotalRate=" + maxTotalRate : "") + (!minTotalRate.isEmpty() ? "&minTotalRate=" + minTotalRate : "")
				+ (!minGuestRating.isEmpty() ? "&minGuestRating=" + minGuestRating : "") + (!maxGuestRating.isEmpty() ? "&maxGuestRating=" + maxGuestRating : "");
		
		RootObject rootObject = restTemplate.getForObject(
				"https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel" + params,
				RootObject.class);

		return new ModelAndView("listResult", "root", rootObject);

	}


}
