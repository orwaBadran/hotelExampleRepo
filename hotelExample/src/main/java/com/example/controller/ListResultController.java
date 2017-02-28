package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.entities.RootObject;
import com.example.service.OfferService;

@Controller
public class ListResultController {

	@Autowired
	private OfferService offerService;

	@RequestMapping("/listResult")
	public ModelAndView listResult(@RequestParam(required = false, defaultValue = "") String destinationName,
			@RequestParam(required = false, defaultValue = "") String lengthOfStay,
			@RequestParam(required = false, defaultValue = "") String minTripStartDate,
			@RequestParam(required = false, defaultValue = "") String maxTripStartDate,
			@RequestParam(required = false, defaultValue = "") String minStarRating,
			@RequestParam(required = false, defaultValue = "") String maxStarRating,
			@RequestParam(required = false, defaultValue = "") String minTotalRate,
			@RequestParam(required = false, defaultValue = "") String maxTotalRate,
			@RequestParam(required = false, defaultValue = "") String minGuestRating,
			@RequestParam(required = false, defaultValue = "") String maxGuestRating) {

		RootObject rootObject = offerService.retrieveRootObject(destinationName, lengthOfStay, minTripStartDate,
				maxTripStartDate, minStarRating, maxStarRating, minTotalRate, maxTotalRate, minGuestRating,
				maxGuestRating);

		return new ModelAndView("listResult", "root", rootObject);

	}

}
