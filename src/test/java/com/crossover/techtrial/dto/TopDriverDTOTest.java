package com.crossover.techtrial.dto;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.BeforeClass;
import org.junit.Test;

public class TopDriverDTOTest {
	public static TopDriverDTO topDriverDTO;
	
	@BeforeClass
	public static void init(){
		topDriverDTO = new TopDriverDTO();
	}
	
	@Test
	public void testGetName(){
		String name = "spider";
		topDriverDTO.setName(name);
		assertEquals(topDriverDTO.getName(), name);
	}
	
	@Test
    public void testGetEmail() {
		String email = "spider@rider.com";
		topDriverDTO.setEmail(email);
        assertEquals(topDriverDTO.getEmail() , email);
    }
	
	@Test
	public void testGetTotalRideDurationInSeconds(){
		Long totalRideDuration = new Random().nextLong();
		topDriverDTO.setTotalRideDurationInSeconds(totalRideDuration);
		assertEquals(topDriverDTO.getTotalRideDurationInSeconds(), totalRideDuration);
	}
	
	@Test
	public void testGetMaxRideDurationInSecods(){
		Long maxRideDurationInSecods = new Random().nextLong();
		topDriverDTO.setMaxRideDurationInSecods(maxRideDurationInSecods);
		assertEquals(topDriverDTO.getMaxRideDurationInSecods(), maxRideDurationInSecods);
	}
	
	@Test
	public void testGetAverageDistance(){
		Double averageDistance = new Random().nextDouble();
		topDriverDTO.setAverageDistance(averageDistance);
		assertEquals(topDriverDTO.getAverageDistance(), averageDistance);
	}
}
