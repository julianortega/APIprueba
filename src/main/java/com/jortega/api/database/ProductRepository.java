package com.jortega.api.database;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jortega.api.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
