package com.microservicefour.models.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicefour.models.entity.Person;
import com.microservicefour.models.entity.Product;
import com.microservicefour.models.repository.PersonaRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public List<Product> getAllProduct() {		
		
		System.out.println();
		
		List<Product> listaProductos = new ArrayList<Product>();
		
		personaRepository.findAll().forEach(x -> {
			
			Person person = new Person();
			Product product = new Product();
			
			product.setIdProduct(x.getProduct().getIdProduct());
			product.setRandom(x.getProduct().getRandom());
			product.setRandomFloat(x.getProduct().getRandomFloat());
			product.setBool(x.getProduct().getBool());
			product.setDate(x.getProduct().getDate());
			product.setRegEx(x.getProduct().getRegEx());
			product.setEnumValue(x.getProduct().getEnumValue());
			product.setElts(x.getProduct().getElts());
			product.setFechaCreacion(x.getProduct().getFechaCreacion());
			
			person.setCity(x.getCity());
			person.setId(x.getId());
			person.setCountry(x.getCountry());
			person.setCity(x.getCity());
			person.setEmail(x.getEmail());
			person.setFirstName(x.getFirstName());
			person.setFirstName2(x.getFirstName2());
			person.setLastName(x.getLastName());
			person.setLastName2(x.getLastName2());
			
			product.setPerson(person);
			listaProductos.add(product);
			
		});
		
		return listaProductos;
	}
	
	
	
}
