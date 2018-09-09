package com.crossover.techtrial.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.junit4.SpringRunner;

import com.crossover.techtrial.model.Person;
import com.crossover.techtrial.repositories.PersonRepository;


public class PersonServiceImplTest {
	@InjectMocks
	private PersonServiceImpl personServiceImpl;
	
	@Mock
	private PersonRepository personRepository;
	
	@Before
	public void setup() throws Exception {
		MockitoAnnotations.initMocks(this);
	}
	
	public void testSave(){
		Person personMock = Mockito.mock(Person.class);
		Mockito.when(personRepository.save(personMock)).thenReturn(personMock);
	}
	
	public void testGetAll(){
		List<Person> personList = new ArrayList<>();
		Mockito.when(personRepository.findAll()).thenReturn(personList);
	}
	
	public void testFindById(){
		Person personMock = Mockito.mock(Person.class);
		Mockito.when(personRepository.findById(personMock.getId())).thenReturn(Optional.of(personMock));
	}
}
