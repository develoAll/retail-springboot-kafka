package com.microserviceone.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microserviceone.models.entity.Person;
import com.microserviceone.models.repository.PersonaRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private PersonaRepository personaRepository;
	
	
	@Override
	public void setPersonProduct(Person person) {
		personaRepository.save(person);
	}

}
