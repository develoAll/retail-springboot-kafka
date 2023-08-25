package com.microserviceone.models.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microserviceone.models.entity.Product;
import com.microserviceone.models.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository ProductRepository;
	
	
	@Override
	public void setProduct(Product product) {
		ProductRepository.save(product);
	}

}
