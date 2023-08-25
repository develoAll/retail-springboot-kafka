package com.microserviceone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.RestController;

import com.microserviceone.models.entity.Product;
import com.microserviceone.models.service.ProductService;


@RestController
public class ProductController {

	
	@Autowired
	private ProductService productoService;
	
	public void createProduct(Product product){
		productoService.setProduct(product);
	}
	
	@KafkaListener(topics = {"example-topic"}, groupId = "my-group-id")
	public void listener(String message) {
		
		Product productoCargado = new Product();
		
		productoCargado.setRandom(1);
		productoCargado.setRandom_float(68.2311);
		productoCargado.setBool(false);
		productoCargado.setRegex("mensaje");
		productoCargado.setEnun("hola2");
		productoCargado.setElt("AASDA");
		productoCargado.setAge(13);
		
		createProduct(productoCargado);
		System.out.println("Mensaje Recibido es: " + message);
	}
}
