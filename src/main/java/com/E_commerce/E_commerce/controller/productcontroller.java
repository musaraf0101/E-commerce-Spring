package com.E_commerce.E_commerce.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class productcontroller {
	
	@GetMapping("/products")
	public List<Map<String,Object>> getallproduct() {
		
		return Arrays.asList(
				Map.of("name","product 1 ","price","234"),
				Map.of("name","product 2 ","price","123")
				);
	}
}
