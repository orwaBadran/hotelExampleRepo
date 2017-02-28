package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HotelExampleApplicationTests {

	@Autowired
	private ListResultController listResult;
	
	@Test
	public void contextLoads() {
		try {
			//listResult.listResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
