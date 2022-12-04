package com.axis.projecteureka.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.projecteureka.entity.Product;
import com.axis.projecteureka.exceptions.ProductNotExistsException;
import com.axis.projecteureka.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
    private ProductRepository productRepository;
	
	 // list of all the products
    public List<Product> listProducts() {
        // first fetch all the products
        List<Product> products = productRepository.findAll();    
        return products;
    }
    public Product getProduct(Integer id) {
    	return productRepository.getById(id);
    }
    
    public Product findById(Integer productId) throws ProductNotExistsException {
        Optional<Product> optionalProduct = productRepository.findById(productId);
        if (optionalProduct.isEmpty()) {
            throw new ProductNotExistsException("product id is invalid: " + productId);
        }
        return optionalProduct.get();
    }
    
    
    
}