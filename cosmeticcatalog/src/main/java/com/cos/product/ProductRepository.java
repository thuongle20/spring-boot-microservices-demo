package com.cos.product;
import org.springframework.data.repository.CrudRepository;
import com.cos.product.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	
	// This will be AUTO IMPLEMENTED by Spring into a Bean called productRepository
	//with all Create, update, Delete operations
	

	

	}

