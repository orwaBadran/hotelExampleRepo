package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.entities.RootObject;

@Controller
public class ListResultController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping("/listResult")
	public ModelAndView listResult() {

		RootObject rootObject = restTemplate.getForObject(
				"https://offersvc.expedia.com/offers/v2/getOffers?scenario=deal-finder&page=foo&uid=foo&productType=Hotel",
				RootObject.class);
				
		return new ModelAndView("listResult", "root", rootObject);

	}

}
