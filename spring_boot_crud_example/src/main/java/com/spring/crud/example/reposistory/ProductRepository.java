package com.spring.crud.example.reposistory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.crud.example.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	Product findByName(String name);

	
	

}
