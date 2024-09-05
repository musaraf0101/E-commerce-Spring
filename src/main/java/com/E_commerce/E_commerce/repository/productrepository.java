package com.E_commerce.E_commerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.E_commerce.E_commerce.models.product;

@Repository

public interface productrepository extends JpaRepository<product,Long> {
	

}
