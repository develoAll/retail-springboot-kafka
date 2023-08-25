package com.microservicefour.models.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservicefour.models.entity.Product;
import com.microservicefour.models.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product>  getAllProduct() {
		return (List<Product> ) productRepository.findAll();
	}
	
	
	
}
