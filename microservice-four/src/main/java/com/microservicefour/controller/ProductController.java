package com.microservicefour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicefour.models.entity.Product;
import com.microservicefour.models.service.ProductService;


@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/api/listar")
	public List<Product> listar(){
		return productService.getAllProduct();
	}

}
