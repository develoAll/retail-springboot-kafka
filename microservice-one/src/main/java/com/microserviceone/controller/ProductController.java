package com.microserviceone.controller;

import java.io.IOException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microserviceone.models.entity.Person;
import com.microserviceone.models.entity.Product;
import com.microserviceone.models.service.ProductService;


@RestController
public class ProductController {

	
	@Autowired
	private ProductService productService;
	
 	private final ObjectMapper objectMapper;

    @Autowired
    public ProductController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }
	
	
	@KafkaListener(topics = {"example-topic"}, groupId = "my-group-id")
	public void listener(String message) {
		
		try {
			System.out.println("Mensaje Recibido es: " + message);
			
			Product miObjeto = objectMapper.readValue(message, Product.class);
			
			Person Person = miObjeto.getPerson();
			Product sendProduct = miObjeto;
			sendProduct.setFechaCreacion(new Date());
			sendProduct.setPerson(Person);
			
			Person.setProduct(sendProduct);
			
			productService.setPersonProduct(Person);
		
	        System.out.println("firstName: " + miObjeto.getPerson().getFirstName());
	        System.out.println("lastName: " + miObjeto.getPerson().getLastName());
	        System.out.println("city: " + miObjeto.getPerson().getCity());
	        System.out.println("country: " + miObjeto.getPerson().getCountry());
	        System.out.println("firstName2: " + miObjeto.getPerson().getFirstName2());
	        System.out.println("lastName2: " + miObjeto.getPerson().getLastName2());
	        System.out.println("email: " + miObjeto.getPerson().getEmail());
			System.out.println("firstName: " + miObjeto.getPerson().getFirstName());
			
	        System.out.println("random: " + miObjeto.getRandom());
	        System.out.println("randomFloat: " + miObjeto.getRandomFloat());
	        System.out.println("bool: " + miObjeto.getBool());
	        System.out.println("date: " + miObjeto.getDate());
	        System.out.println("regEx: " + miObjeto.getRegEx());
	        System.out.println("enumValue: " + miObjeto.getEnumValue());
	       System.out.println("elts: " + miObjeto.getElts());
	        
	        
		}catch (IOException e) {
			e.printStackTrace();
		}
		
        
        /*
		Product productoCargado = new Product();
		
		productoCargado.setRandom(1);
		productoCargado.setRandom_float(68.2311);
		productoCargado.setBool(false);
		productoCargado.setRegex("mensaje");
		productoCargado.setEnun("hola2");
		productoCargado.setElt("AASDA");
		productoCargado.setAge(13);*/
		
		// createProduct(productoCargado);
		// System.out.println("Mensaje Recibido es: " + message);
	}
}
