package com.E_commerce.E_commerce;

import java.lang.reflect.Array;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.E_commerce.E_commerce.models.product;
import com.E_commerce.E_commerce.repository.productrepository;

@Component
public class dataseeder {
	
	@Autowired
	private productrepository productRepository;
	
	public void run(String...args)throws Exception{
		
		if(productrepository.count()==0) {
			List<product>products=Array.osList(
					new product()
					);
		}
	}
}
