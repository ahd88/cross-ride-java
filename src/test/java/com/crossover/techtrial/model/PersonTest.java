package com.crossover.techtrial.model;

import static org.junit.Assert.assertEquals;

import java.util.Random;

import org.junit.BeforeClass;
import org.junit.Test;

public class PersonTest {
	private static Person person;
	
	@BeforeClass
	public static void init(){
		person = new Person();
	}
	
	@Test
	public void testGetId(){
		Long id = new Random().nextLong();
		person.setId(id);
		assertEquals(person.getId(), id);
	}
	
	@Test
	public void testGetName(){
		String name = "spider";
		person.setName(name);
		assertEquals(person.getName(), name);
	}
	
	@Test
    public void testGetEmail() {
		String email = "spider@rider.com";
        person.setEmail(email);
        assertEquals(person.getEmail() , email);
    }
	
	@Test
    public void testGetRegistrationNumber() {
		String reg_number = "R20180904102934";
        person.setRegistrationNumber(reg_number);
        assertEquals(person.getRegistrationNumber() , reg_number);
    }
}
