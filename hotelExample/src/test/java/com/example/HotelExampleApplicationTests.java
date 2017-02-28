package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.entities.RootObject;
import com.example.service.OfferService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HotelExampleApplicationTests {

	@Autowired
	private OfferService OfferService;

	@Test
	public void contextLoads() {

		RootObject rootObject = OfferService.retrieveRootObject("", "", "", "", "", "", "", "", "", "");
		
		Assert.assertNotNull(rootObject.toString(), rootObject);
	}

}
