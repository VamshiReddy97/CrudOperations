 
package com.spring.crud.example.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.example.entity.Product;
import com.spring.crud.example.reposistory.ProductRepository;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repository;

	public Product saveProduct(Product product) {
		return repository.save(product);

	}
	public List <Product> saveProduct(List<Product>products){
		return repository.saveAll(products);
		
	}
	
	public List<Product> getProducts (){
		return repository.findAll();
	}
	
	public Product getProductById(int id){
		return repository.findById(id).orElse(null);
	}

	public Product getProductByName(String name){
		return repository.findByName(name);
	}
	
	public String deleteProduct(int id) {
		return " product remove !!" + id;
	}
	public Product UpdateProduct(Product product) {
		Product existingProduct=repository.findById(product.getId()).orElse(null);
		existingProduct.setName(product.getName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setPrice(product.getPrice());
		return repository.save(existingProduct);
	}
	
}
