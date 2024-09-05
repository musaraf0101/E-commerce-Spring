package com.E_commerce.E_commerce.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.E_commerce.E_commerce.models.product;
import com.E_commerce.E_commerce.services.productservice;

@RestController
@RequestMapping("/products")

public class productcontroller {
	 
	@Autowired
	private productservice productService;
	
	@GetMapping
	public List<product> getallproduct() {
		return productService.getallproduct();
	}
	@GetMapping("/category")
	public List<Map<String,Object>> getallcategoryproduct() {
		
		return Arrays.asList(
				Map.of("name","product 1 ","price","234"),
				Map.of("name","product 2 ","price","123")
				);
	}
}
