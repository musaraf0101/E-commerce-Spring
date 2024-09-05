package com.E_commerce.E_commerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.E_commerce.E_commerce.models.product;
import com.E_commerce.E_commerce.repository.productrepository;

@Service
public class productservice {
	
	@Autowired
	private productrepository productRepository;
	
	public List<product>getallproduct(){
		return productRepository.findAll();
	}
}
